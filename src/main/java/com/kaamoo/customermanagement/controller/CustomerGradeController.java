package com.kaamoo.customermanagement.controller;

import com.kaamoo.customermanagement.entity.CustomerGrade;
import com.kaamoo.customermanagement.service.CustomerGradeService;
import com.kaamoo.customermanagement.transmit.Result;
import com.kaamoo.customermanagement.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/27 0027.
 */

@RestController
@RequestMapping("customer/grade")
public class CustomerGradeController {

    @Autowired
    private CustomerGradeService customerGradeService;
    @PostMapping("create")
    public Result<CustomerGrade> create(@Validated CustomerGrade customerGrade , BindingResult bindingResult){
        Result<CustomerGrade> response = CommonUtil.response(bindingResult);
        if(response.isSuccess()){
           response.setData(customerGradeService.create(customerGrade));
        }
        return response;
    }
}
