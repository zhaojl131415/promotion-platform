package com.promotion.platform.greenhouses.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.promotion.platform.greenhouses.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 商户信息 映射接口类
 * @date 2023-02-02
 */
@Mapper
public interface MerchantMapper extends BaseMapper<Merchant> {
}
