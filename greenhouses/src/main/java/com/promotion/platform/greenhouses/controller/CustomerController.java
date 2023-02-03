package com.promotion.platform.greenhouses.controller;

import com.promotion.platform.greenhouses.common.Result;
import com.promotion.platform.greenhouses.service.CustomerService;
import com.promotion.platform.greenhouses.vo.CustomerVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 客户信息控制器
 * @date 2023-02-02
 */
@Slf4j
@Api(tags = "客户信息控制器")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @ApiOperation("客户增加")
    @PostMapping("/add")
    public Result add(@RequestBody CustomerVO.AddVO vo){
        log.info("user: {}", vo);
        customerService.add(vo.getName(), vo.getPhone(), vo.getAddress());
        return Result.ok();
    }
}
