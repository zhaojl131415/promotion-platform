package com.promotion.platform.greenhouses.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.promotion.platform.greenhouses.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 客户信息 映射接口类
 * @date 2023-02-02
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
}
