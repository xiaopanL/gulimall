package com.li.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.common.utils.PageUtils;
import com.li.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * ??ҳ?ֲ????
 *
 * @author xiaopang
 * @email xiaopangli82@gmail.com
 * @date 2023-11-06 16:18:16
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

