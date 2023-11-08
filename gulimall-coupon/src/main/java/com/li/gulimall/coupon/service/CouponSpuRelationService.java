package com.li.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.common.utils.PageUtils;
import com.li.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * ?Ż?ȯ????Ʒ????
 *
 * @author xiaopang
 * @email xiaopangli82@gmail.com
 * @date 2023-11-06 16:18:16
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

