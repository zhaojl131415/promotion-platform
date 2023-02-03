package com.promotion.platform.greenhouses.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.promotion.platform.greenhouses.entity.Merchant;
import com.promotion.platform.greenhouses.mapper.MerchantMapper;
import com.promotion.platform.greenhouses.service.MerchantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 商户信息服务实现类
 * @date 2023-02-02
 */
@Service
@Slf4j
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant> implements MerchantService {
    /**
     * 新增商户
     *
     * @param name    商户姓名
     * @param phone   商户电话
     * @param address 商户地址
     */
    @Override
    public void add(String name, String phone, String address) {
        Merchant merchant = new Merchant();
        merchant.setName(name);
        merchant.setPhone(phone);
        merchant.setAddress(address);
        this.save(merchant);
    }
}
