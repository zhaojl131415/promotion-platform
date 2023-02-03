package com.promotion.platform.greenhouses.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.promotion.platform.greenhouses.entity.Distribution;
import com.promotion.platform.greenhouses.mapper.DistributionMapper;
import com.promotion.platform.greenhouses.service.DistributionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description 客户分配接口实现类
 * @date 2023-02-02
 */
@Service
@Slf4j
public class DistributionServiceImpl extends ServiceImpl<DistributionMapper, Distribution> implements DistributionService {
}
