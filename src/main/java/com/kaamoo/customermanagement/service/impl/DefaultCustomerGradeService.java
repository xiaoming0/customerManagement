package com.kaamoo.customermanagement.service.impl;

import com.kaamoo.customermanagement.entity.CustomerGrade;
import com.kaamoo.customermanagement.mappers.CustomerGradeMapper;
import com.kaamoo.customermanagement.service.CustomerGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
@Service
public class DefaultCustomerGradeService implements CustomerGradeService{

    @Autowired
    private CustomerGradeMapper customerGradeMapper;


    @Override
    public CustomerGrade create(CustomerGrade customerGrade) {
        customerGrade.setCreated(new Date());
        customerGrade.setUpdated(new Date());
        customerGrade.setVersion(1);
        customerGradeMapper.insert(customerGrade);
        return customerGrade;
    }
}
