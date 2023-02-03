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
 * @description 客户分配 实体类
 * @date 2023-02-02
 */
@Data
@TableName(value = "distribution")
public class DistributionVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Data
    public static class AddVO implements Serializable {
        private static final long serialVersionUID = 1L;

        /**
         * 客户id
         */
        private Integer customerId;

        /**
         * 商户id
         */
        private Integer merchantId;
    }
}