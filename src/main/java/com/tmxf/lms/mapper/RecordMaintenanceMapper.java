package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.RecordMaintenance;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * The interface Record maintenance mapper.
 */
public interface RecordMaintenanceMapper {
    /**
     * Delete by primary key int.
     *
     * @param rmId the rm id
     * @return the int
     */
    @Delete({
        "delete from record_maintenance",
        "where rm_id = #{rmId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rmId);

   /* *//**
     * Insert int.
     *
     * @param record the record
     * @return the int
     *//*
    @Insert({
        "insert into record_maintenance (rm_id, rm_lift, ",
        "rm_date, rm_type, ",
        "rm_user, rm_login, ",
        "rm_login_addr, rm_logout, ",
        "rm_logout_addr, rm_url, ",
        "rm_description)",
        "values (#{rmId,jdbcType=INTEGER}, #{rmLift,jdbcType=INTEGER}, ",
        "#{rmDate,jdbcType=TIMESTAMP}, #{rmType,jdbcType=VARCHAR}, ",
        "#{rmUser,jdbcType=VARCHAR}, #{rmLogin,jdbcType=TIMESTAMP}, ",
        "#{rmLoginAddr,jdbcType=VARCHAR}, #{rmLogout,jdbcType=TIMESTAMP}, ",
        "#{rmLogoutAddr,jdbcType=VARCHAR}, #{rmUrl,jdbcType=VARCHAR}, ",
        "#{rmDescription,jdbcType=VARCHAR})"
    })
    int insert(RecordMaintenance record);*/

    /**
     * Select by primary key record maintenance.
     *
     * @param rmId the rm id
     * @return the record maintenance
     */
    @Select({
        "select",
        "rm_id, rm_lift, rm_date, rm_type, rm_user, rm_login, rm_login_addr, rm_logout, ",
        "rm_logout_addr, rm_url, rm_description",
        "from record_maintenance",
        "where rm_id = #{rmId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="rm_id", property="rmId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="rm_lift", property="rmLift", jdbcType=JdbcType.INTEGER),
        @Result(column="rm_date", property="rmDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rm_type", property="rmType", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_user", property="rmUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_login", property="rmLogin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rm_login_addr", property="rmLoginAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_logout", property="rmLogout", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rm_logout_addr", property="rmLogoutAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_url", property="rmUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_description", property="rmDescription", jdbcType=JdbcType.VARCHAR)
    })
    RecordMaintenance selectByPrimaryKey(Integer rmId);

    /**
     * Select all list.
     *
     * @return the list
     */
    @Select({
        "select",
        "rm_id, rm_lift, rm_date, rm_type, rm_user, rm_login, rm_login_addr, rm_logout, ",
        "rm_logout_addr, rm_url, rm_description",
        "from record_maintenance"
    })
    @Results({
        @Result(column="rm_id", property="rmId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="rm_lift", property="rmLift", jdbcType=JdbcType.INTEGER),
        @Result(column="rm_date", property="rmDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rm_type", property="rmType", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_user", property="rmUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_login", property="rmLogin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rm_login_addr", property="rmLoginAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_logout", property="rmLogout", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rm_logout_addr", property="rmLogoutAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_url", property="rmUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="rm_description", property="rmDescription", jdbcType=JdbcType.VARCHAR)
    })
    List<RecordMaintenance> selectAll();

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    @Update({
        "update record_maintenance",
        "set rm_lift = #{rmLift,jdbcType=INTEGER},",
          "rm_date = #{rmDate,jdbcType=TIMESTAMP},",
          "rm_type = #{rmType,jdbcType=VARCHAR},",
          "rm_user = #{rmUser,jdbcType=VARCHAR},",
          "rm_login = #{rmLogin,jdbcType=TIMESTAMP},",
          "rm_login_addr = #{rmLoginAddr,jdbcType=VARCHAR},",
          "rm_logout = #{rmLogout,jdbcType=TIMESTAMP},",
          "rm_logout_addr = #{rmLogoutAddr,jdbcType=VARCHAR},",
          "rm_url = #{rmUrl,jdbcType=VARCHAR},",
          "rm_description = #{rmDescription,jdbcType=VARCHAR}",
        "where rm_id = #{rmId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RecordMaintenance record);


    /**
     * 通过ID查询单条数据
     *
     * @param rmId 主键
     * @return 实例对象
     */
    RecordMaintenance queryById(Integer rmId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RecordMaintenance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param recordMaintenance 实例对象
     * @return 对象列表
     */
    List<RecordMaintenance> queryAll(RecordMaintenance recordMaintenance);

    /**
     * 新增数据
     *
     * @param recordMaintenance 实例对象
     * @return 影响行数
     */
    int insert(RecordMaintenance recordMaintenance);

    /**
     * 批量插入
     * @param liftNum
     * @param mDate
     * @param count
     * @return
     */
    void insertMany(Integer liftNum, Date mDate,int count);

    /**
     * 修改数据
     *
     * @param recordMaintenance 实例对象
     * @return 影响行数
     */
    int update(RecordMaintenance recordMaintenance);

    /**
     * 通过主键删除数据
     *
     * @param rmId 主键
     * @return 影响行数
     */
    int deleteById(Integer rmId);
}