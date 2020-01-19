package org.yuan.boot.shower.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.dao.BaseCustomerConsumeRecordDao;
import org.yuan.boot.shower.pojo.converter.BaseCustomerConsumeRecordConverter;
import org.yuan.boot.shower.service.BaseCustomerConsumeRecordService;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 21:23
 */
@Service
@AllArgsConstructor
public class BaseCustomerConsumeRecordServiceImpl implements BaseCustomerConsumeRecordService {
    private BaseCustomerConsumeRecordDao baseCustomerConsumeRecordDao;
    private BaseCustomerConsumeRecordConverter baseCustomerConsumeRecordConverter;
}