package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.Invoice;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface InvoiceMapper {
    @Insert({
            "insert into invoice (invoice_id, invoice_money, ",
            "invoice_user, invoice_money_upper, ",
            "invoice_company, invoice_num)",
            "values (#{invoiceId,jdbcType=VARCHAR}, #{invoiceMoney,jdbcType=DOUBLE}, ",
            "#{invoiceUser,jdbcType=INTEGER}, #{invoiceMoneyUpper,jdbcType=VARCHAR}, ",
            "#{invoiceCompany,jdbcType=VARCHAR}, #{invoiceNum,jdbcType=VARCHAR})"
    })
    int insert(Invoice record);

    @Select({
            "select",
            "invoice_id, invoice_money, invoice_user, invoice_money_upper, invoice_company, ",
            "invoice_num",
            "from invoice"
    })
    @Results({
            @Result(column = "invoice_id", property = "invoiceId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "invoice_money", property = "invoiceMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "invoice_user", property = "invoiceUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "invoice_money_upper", property = "invoiceMoneyUpper", jdbcType = JdbcType.VARCHAR),
            @Result(column = "invoice_company", property = "invoiceCompany", jdbcType = JdbcType.VARCHAR),
            @Result(column = "invoice_num", property = "invoiceNum", jdbcType = JdbcType.VARCHAR)
    })
    List<Invoice> selectAll();
}