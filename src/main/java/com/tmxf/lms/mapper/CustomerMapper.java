package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Customer;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * @author TMXIAOPAI
 */
@Mapper
public interface CustomerMapper {
    /**
     * 查找所有客户信息
     *
     * @return
     */
    @Select({"select * from customer"})
    List<Customer> findAllCustomer();

    /**
     * 插入客户数据
     *
     * @param customer
     */
    @Insert({
            "insert into customer (customer_num,customer_name,",
            "customer_phone,customer_portraition,",
            "customer_open_bank,customer_open_name,",
            "customer_open_card,customer_type,customer_email)",
            "values (#{customerNum,jdbcType=INTEGER},#{customerName,jdbcType=VARCHAR},",
            "#{customerPhone,jdbcType=VARCHAR},#{customerPortraition,jdbcType=VARCHAR},",
            "#{customerOpenBank,jdbcType=VARCHAR},#{customerOpenName,jdbcType=VARCHAR},",
            "#{customerOpenCard,jdbcType=VARCHAR},#{customerType,jdbcType=INTEGER},",
            "#{customerEmail,jdbcType=VARCHAR})"
    })
    void insertCustomer(Customer customer);

    /**
     * 更新客户数据
     *
     * @param customer
     */
    @Update({
            "update customer set ",
            "customer_name=#{customerName,jdbcType=VARCHAR},",
            "customer_phone=#{customerPhone,jdbcType=VARCHAR},",
            "customer_portraition=#{customerPortraition,jdbcType=VARCHAR},",
            "customer_open_bank=#{customerOpenBank,jdbcType=VARCHAR},",
            "customer_open_name=#{customerOpenName,jdbcType=VARCHAR},",
            "customer_open_card=#{customerOpenCard,jdbcType=VARCHAR},",
            "customer_type=#{customerType,jdbcType=INTEGER},customer_email=#{customerEmail,jdbcType=VARCHAR}",
            "where customer_num=#{customerNum,jdbcType=INTEGER}"
    })
    void updateCustomer(Customer customer);

    /**
     * 通过主键来删除记录
     *
     * @param customerNum
     * @return
     */
    @Delete({
            "delete from customer where customer_num=#{customerNum}"
    })
    int deleteCustomerByCustomerNum(Integer customerNum);
}