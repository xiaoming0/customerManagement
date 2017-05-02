package com.kaamoo.customermanagement.mappers;

import com.kaamoo.customermanagement.entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectByParam(@Param("phone") String phone, @Param("name") String name,
                                 @Param("companyId") Long companyId, @Param("gradeId") Long[] gradeId,@Param("type") Integer[] type,
                                 @Param("allowOverdraw") Boolean allowOverdraw, @Param("offset")Long offset, @Param("limit")Long limit);
    Long countByParam(@Param("phone") String phone, @Param("name") String name,
                      @Param("companyId") Long companyId, @Param("gradeId") Long[] gradeId,@Param("type") Integer[] type,
                      @Param("allowOverdraw") Boolean allowOverdraw);
}