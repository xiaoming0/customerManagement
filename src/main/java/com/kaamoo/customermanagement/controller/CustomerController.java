package com.kaamoo.customermanagement.controller;

import com.kaamoo.customermanagement.entity.Customer;
import com.kaamoo.customermanagement.service.CustomerService;
import com.kaamoo.customermanagement.transmit.PageData;
import com.kaamoo.customermanagement.transmit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
@RestController
@RequestMapping("customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping("findByParam")
    public PageData<Customer> findByParam(
            String phone,String name,Long companyId,Long[] gradeId,Integer[] type,Boolean allowOverdraw,Long offset,Long limit){

        PageData<Customer> result =  customerService.findByParam(phone,name,companyId,gradeId,type,allowOverdraw,offset,limit);

        return result;
    }

}
