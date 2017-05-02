package com.kaamoo.customermanagement.mappers;

import com.kaamoo.customermanagement.entity.CustomerGrade;

public interface CustomerGradeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerGrade record);

    int insertSelective(CustomerGrade record);

    CustomerGrade selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerGrade record);

    int updateByPrimaryKey(CustomerGrade record);
}