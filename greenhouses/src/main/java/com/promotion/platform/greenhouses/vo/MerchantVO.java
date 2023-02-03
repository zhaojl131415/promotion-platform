package com.promotion.platform.greenhouses.vo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 商户信息 实体类
 * @date 2023-02-02
 */
public class MerchantVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Data
    public static class AddVO implements Serializable {
        private static final long serialVersionUID = 1L;

        /**
         * 商户姓名
         */
        private String name;

        /**
         * 商户电话
         */
        private String phone;

        /**
         * 商户地址
         */
        private String address;
    }
}