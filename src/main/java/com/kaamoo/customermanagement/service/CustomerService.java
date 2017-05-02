package com.kaamoo.customermanagement.service;

import com.kaamoo.customermanagement.entity.Customer;
import com.kaamoo.customermanagement.transmit.PageData;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public interface CustomerService {
    PageData<Customer> findByParam(String phone, String name, Long companyId, Long[] gradeId, Integer[] type, Boolean allowOverdraw, Long offset, Long limit);
}
