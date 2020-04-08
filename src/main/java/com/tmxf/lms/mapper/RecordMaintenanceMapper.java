package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.RecordMaintenance;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface RecordMaintenanceMapper {
    @Delete({
            "delete from record_maintenance",
            "where rm_id = #{rmId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rmId);

    @Insert({
            "insert into record_maintenance (rm_id, rm_lift, ",
            "rm_url, rm_user, rm_date, ",
            "rm_type, rm_login, ",
            "rm_logout, rm_login_addr, ",
            "rm_logout_addr)",
            "values (#{rmId,jdbcType=INTEGER}, #{rmLift,jdbcType=INTEGER}, ",
            "#{rmUrl,jdbcType=VARCHAR}, #{rmUser,jdbcType=INTEGER}, #{rmDate,jdbcType=DATE}, ",
            "#{rmType,jdbcType=VARCHAR}, #{rmLogin,jdbcType=TIMESTAMP}, ",
            "#{rmLogout,jdbcType=TIMESTAMP}, #{rmLoginAddr,jdbcType=VARCHAR}, ",
            "#{rmLogoutAddr,jdbcType=VARCHAR})"
    })
    int insert(RecordMaintenance record);

    @Select({
            "select",
            "rm_id, rm_lift, rm_url, rm_user, rm_date, rm_type, rm_login, rm_logout, rm_login_addr, ",
            "rm_logout_addr",
            "from record_maintenance",
            "where rm_id = #{rmId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "rm_id", property = "rmId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "rm_lift", property = "rmLift", jdbcType = JdbcType.INTEGER),
            @Result(column = "rm_url", property = "rmUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "rm_user", property = "rmUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "rm_date", property = "rmDate", jdbcType = JdbcType.DATE),
            @Result(column = "rm_type", property = "rmType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "rm_login", property = "rmLogin", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "rm_logout", property = "rmLogout", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "rm_login_addr", property = "rmLoginAddr", jdbcType = JdbcType.VARCHAR),
            @Result(column = "rm_logout_addr", property = "rmLogoutAddr", jdbcType = JdbcType.VARCHAR)
    })
    RecordMaintenance selectByPrimaryKey(Integer rmId);

    @Select({
            "select",
            "rm_id, rm_lift, rm_url, rm_user, rm_date, rm_type, rm_login, rm_logout, rm_login_addr, ",
            "rm_logout_addr",
            "from record_maintenance"
    })
    @Results({
            @Result(column = "rm_id", property = "rmId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "rm_lift", property = "rmLift", jdbcType = JdbcType.INTEGER),
            @Result(column = "rm_url", property = "rmUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "rm_user", property = "rmUser", jdbcType = JdbcType.INTEGER),
            @Result(column = "rm_date", property = "rmDate", jdbcType = JdbcType.DATE),
            @Result(column = "rm_type", property = "rmType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "rm_login", property = "rmLogin", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "rm_logout", property = "rmLogout", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "rm_login_addr", property = "rmLoginAddr", jdbcType = JdbcType.VARCHAR),
            @Result(column = "rm_logout_addr", property = "rmLogoutAddr", jdbcType = JdbcType.VARCHAR)
    })
    List<RecordMaintenance> selectAll();

    @Update({
            "update record_maintenance",
            "set rm_lift = #{rmLift,jdbcType=INTEGER},",
            "rm_url = #{rmUrl,jdbcType=VARCHAR},",
            "rm_user = #{rmUser,jdbcType=INTEGER},",
            "rm_date = #{rmDate,jdbcType=DATE},",
            "rm_type = #{rmType,jdbcType=VARCHAR},",
            "rm_login = #{rmLogin,jdbcType=TIMESTAMP},",
            "rm_logout = #{rmLogout,jdbcType=TIMESTAMP},",
            "rm_login_addr = #{rmLoginAddr,jdbcType=VARCHAR},",
            "rm_logout_addr = #{rmLogoutAddr,jdbcType=VARCHAR}",
            "where rm_id = #{rmId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RecordMaintenance record);
}