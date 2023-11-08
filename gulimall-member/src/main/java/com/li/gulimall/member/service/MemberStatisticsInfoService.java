package com.li.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.common.utils.PageUtils;
import com.li.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * ??Աͳ????Ϣ
 *
 * @author xiaopang
 * @email xiaopangli82@gmail.com
 * @date 2023-11-06 16:30:22
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

