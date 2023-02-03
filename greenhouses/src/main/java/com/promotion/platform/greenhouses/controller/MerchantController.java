package com.promotion.platform.greenhouses.controller;

import com.promotion.platform.greenhouses.common.Result;
import com.promotion.platform.greenhouses.service.CustomerService;
import com.promotion.platform.greenhouses.service.MerchantService;
import com.promotion.platform.greenhouses.vo.CustomerVO;
import com.promotion.platform.greenhouses.vo.MerchantVO;
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
 * @description 商户信息控制器
 * @date 2023-02-02
 */
@Slf4j
@Api(tags = "商户信息控制器")
@RestController
@RequestMapping("/merchant")
public class MerchantController {

    @Resource
    private MerchantService merchantService;

    @ApiOperation("商户入驻")
    @PostMapping("/add")
    public Result add(@RequestBody MerchantVO.AddVO vo){
        log.info("user: {}", vo);
        merchantService.add(vo.getName(), vo.getPhone(), vo.getAddress());
        return Result.ok();
    }
}
