package com.promotion.platform.greenhouses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.promotion.platform.greenhouses.entity.Merchant;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 商户信息服务接口类
 * @date 2023-02-02
 */
public interface MerchantService extends IService<Merchant> {

    /**
     * 新增商户
     * @param name      商户姓名
     * @param phone     商户电话
     * @param address   商户地址
     */
    void add(String name, String phone, String address);
}
