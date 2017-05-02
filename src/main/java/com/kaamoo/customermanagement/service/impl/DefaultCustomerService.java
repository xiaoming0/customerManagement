package com.kaamoo.customermanagement.service.impl;

import com.kaamoo.customermanagement.entity.Customer;
import com.kaamoo.customermanagement.mappers.CustomerMapper;
import com.kaamoo.customermanagement.service.CustomerService;
import com.kaamoo.customermanagement.transmit.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
@Service
public class DefaultCustomerService implements CustomerService {


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public PageData<Customer> findByParam(String phone, String name, Long companyId, Long[] gradeId, Integer[] type, Boolean allowOverdraw, Long offset, Long limit) {
        List<Customer> customers = customerMapper.selectByParam(
                StringUtils.isEmpty(phone) ? null : "%" + phone + "%",
                StringUtils.isEmpty(name) ? null : "%" + name + "%",
                companyId,
                gradeId != null && gradeId.length > 0 ? gradeId : null,
                type != null && type.length > 0 ? type : null,
                allowOverdraw,offset,limit);
        Long total = customerMapper.countByParam(
                StringUtils.isEmpty(phone) ? null : "%" + phone + "%",
                StringUtils.isEmpty(name) ? null : "%" + name + "%",
                companyId,
                gradeId != null && gradeId.length > 0 ? gradeId : null,
                type != null && type.length > 0 ? type : null,
                allowOverdraw);
        PageData<Customer> data = new PageData<>();
        data.setRows(customers);
        data.setTotal(total);
        return data;
    }
}
