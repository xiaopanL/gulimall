package com.li.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.common.utils.PageUtils;
import com.li.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author xiaopang
 * @email xiaopangli82@gmail.com
 * @date 2023-11-06 13:53:29
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

