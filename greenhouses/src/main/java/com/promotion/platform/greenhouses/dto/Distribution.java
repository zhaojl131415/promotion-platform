package com.promotion.platform.greenhouses.dto;

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
public class Distribution implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 客户电话
     */
    private String phone;

    /**
     * 客户地址
     */
    private String address;

    /**
     * 状态 0默认 1登记 2分配
     */
    private Byte state;

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