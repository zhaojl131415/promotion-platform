package com.promotion.platform.greenhouses.entity;

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
@Data
@TableName(value = "merchant")
public class Merchant implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

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

    /**
     * 类型
     */
    private Integer type;

    /**
     * 状态 1入驻成功 2入驻失败
     */
    private Integer state;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    // 后端传给前端的时间格式
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 前端传给后端的时间格式
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    // 后端传给前端的时间格式
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 前端传给后端的时间格式
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 是否删除 0否 1是
     */
    private Boolean isDel;

    private static final long serialVersionUID = 1L;
}