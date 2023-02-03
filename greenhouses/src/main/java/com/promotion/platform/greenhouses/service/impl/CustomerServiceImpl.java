package com.promotion.platform.greenhouses.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.promotion.platform.greenhouses.entity.Customer;
import com.promotion.platform.greenhouses.mapper.CustomerMapper;
import com.promotion.platform.greenhouses.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 客户信息服务实现类
 * @date 2023-02-02
 */
@Service
@Slf4j
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {
    /**
     * 新增客户
     *
     * @param name    客户姓名
     * @param phone   客户电话
     * @param address 客户地址
     */
    @Override
    public void add(String name, String phone, String address) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setPhone(phone);
        customer.setAddress(address);
        this.save(customer);
    }
}
