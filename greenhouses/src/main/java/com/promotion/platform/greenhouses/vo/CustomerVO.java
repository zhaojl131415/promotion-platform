package com.promotion.platform.greenhouses.vo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 客户信息 实体类
 * @date 2023-02-02
 */
@Data
public class CustomerVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Data
    @ApiModel("新增客户信息请求对象")
    public static class AddVO implements Serializable {
        private static final long serialVersionUID = 1L;

        /**
         * 客户姓名
         */
        @ApiModelProperty("客户姓名")
        private String name;

        /**
         * 客户电话
         */
        @ApiModelProperty("客户电话")
        private String phone;

        /**
         * 客户地址
         */
        @ApiModelProperty("客户地址")
        private String address;
    }
}