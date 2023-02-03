package com.promotion.platform.greenhouses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.promotion.platform.greenhouses.entity.Customer;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 客户信息 服务接口类
 * @date 2023-02-02
 */
public interface CustomerService extends IService<Customer> {

    /**
     * 新增客户
     * @param name      客户姓名
     * @param phone     客户电话
     * @param address   客户地址
     */
    void add(String name, String phone, String address);
}
