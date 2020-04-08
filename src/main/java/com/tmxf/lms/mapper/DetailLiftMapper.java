package com.tmxf.lms.mapper;

import com.tmxf.lms.entity.DetailLift;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface DetailLiftMapper {
    @Delete({
            "delete from detail_lift",
            "where lift_num = #{liftNum,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer liftNum);

    @Insert({
            "insert into detail_lift (lift_num, lift_type, ",
            "lift_model, device_code, ",
            "dead_weight, lift_speed, ",
            "lift_id, building_num, ",
            "ladder_num, lift_brand, ",
            "factory_num, lifting_height, ",
            "well_height, top_floor_height, ",
            "main_engine, st_communication, ",
            "control_model, in_dim, ",
            "CZM, certificate_num, ",
            "governor_num, tractor_num, ",
            "brake_num, ucmp_num, ",
            "car_buffer_num, date_delivery, ",
            "date_install, date_finish, ",
            "lift_count, lift_price, ",
            "p_num, out_dim)",
            "values (#{liftNum,jdbcType=INTEGER}, #{liftType,jdbcType=VARCHAR}, ",
            "#{liftModel,jdbcType=VARCHAR}, #{deviceCode,jdbcType=VARCHAR}, ",
            "#{deadWeight,jdbcType=DOUBLE}, #{liftSpeed,jdbcType=DOUBLE}, ",
            "#{liftId,jdbcType=VARCHAR}, #{buildingNum,jdbcType=INTEGER}, ",
            "#{ladderNum,jdbcType=INTEGER}, #{liftBrand,jdbcType=VARCHAR}, ",
            "#{factoryNum,jdbcType=VARCHAR}, #{liftingHeight,jdbcType=DOUBLE}, ",
            "#{wellHeight,jdbcType=DOUBLE}, #{topFloorHeight,jdbcType=DOUBLE}, ",
            "#{mainEngine,jdbcType=DOUBLE}, #{stCommunication,jdbcType=VARCHAR}, ",
            "#{controlModel,jdbcType=VARCHAR}, #{inDim,jdbcType=VARCHAR}, ",
            "#{czm,jdbcType=VARCHAR}, #{certificateNum,jdbcType=VARCHAR}, ",
            "#{governorNum,jdbcType=VARCHAR}, #{tractorNum,jdbcType=VARCHAR}, ",
            "#{brakeNum,jdbcType=VARCHAR}, #{ucmpNum,jdbcType=VARCHAR}, ",
            "#{carBufferNum,jdbcType=VARCHAR}, #{dateDelivery,jdbcType=DATE}, ",
            "#{dateInstall,jdbcType=DATE}, #{dateFinish,jdbcType=DATE}, ",
            "#{liftCount,jdbcType=INTEGER}, #{liftPrice,jdbcType=DOUBLE}, ",
            "#{pNum,jdbcType=VARCHAR}, #{outDim,jdbcType=VARCHAR})"
    })
    int insert(DetailLift record);

    @Select({
            "select",
            "lift_num, lift_type, lift_model, device_code, dead_weight, lift_speed, lift_id, ",
            "building_num, ladder_num, lift_brand, factory_num, lifting_height, well_height, ",
            "top_floor_height, main_engine, st_communication, control_model, in_dim, CZM, ",
            "certificate_num, governor_num, tractor_num, brake_num, ucmp_num, car_buffer_num, ",
            "date_delivery, date_install, date_finish, lift_count, lift_price, p_num, out_dim",
            "from detail_lift",
            "where lift_num = #{liftNum,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "lift_num", property = "liftNum", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "lift_type", property = "liftType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "lift_model", property = "liftModel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "device_code", property = "deviceCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dead_weight", property = "deadWeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "lift_speed", property = "liftSpeed", jdbcType = JdbcType.DOUBLE),
            @Result(column = "lift_id", property = "liftId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "building_num", property = "buildingNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "ladder_num", property = "ladderNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "lift_brand", property = "liftBrand", jdbcType = JdbcType.VARCHAR),
            @Result(column = "factory_num", property = "factoryNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "lifting_height", property = "liftingHeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "well_height", property = "wellHeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "top_floor_height", property = "topFloorHeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "main_engine", property = "mainEngine", jdbcType = JdbcType.DOUBLE),
            @Result(column = "st_communication", property = "stCommunication", jdbcType = JdbcType.VARCHAR),
            @Result(column = "control_model", property = "controlModel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "in_dim", property = "inDim", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CZM", property = "czm", jdbcType = JdbcType.VARCHAR),
            @Result(column = "certificate_num", property = "certificateNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "governor_num", property = "governorNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "tractor_num", property = "tractorNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "brake_num", property = "brakeNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ucmp_num", property = "ucmpNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "car_buffer_num", property = "carBufferNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "date_delivery", property = "dateDelivery", jdbcType = JdbcType.DATE),
            @Result(column = "date_install", property = "dateInstall", jdbcType = JdbcType.DATE),
            @Result(column = "date_finish", property = "dateFinish", jdbcType = JdbcType.DATE),
            @Result(column = "lift_count", property = "liftCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "lift_price", property = "liftPrice", jdbcType = JdbcType.DOUBLE),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "out_dim", property = "outDim", jdbcType = JdbcType.VARCHAR)
    })
    DetailLift selectByPrimaryKey(Integer liftNum);

    @Select({
            "select",
            "lift_num, lift_type, lift_model, device_code, dead_weight, lift_speed, lift_id, ",
            "building_num, ladder_num, lift_brand, factory_num, lifting_height, well_height, ",
            "top_floor_height, main_engine, st_communication, control_model, in_dim, CZM, ",
            "certificate_num, governor_num, tractor_num, brake_num, ucmp_num, car_buffer_num, ",
            "date_delivery, date_install, date_finish, lift_count, lift_price, p_num, out_dim",
            "from detail_lift"
    })
    @Results({
            @Result(column = "lift_num", property = "liftNum", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "lift_type", property = "liftType", jdbcType = JdbcType.VARCHAR),
            @Result(column = "lift_model", property = "liftModel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "device_code", property = "deviceCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "dead_weight", property = "deadWeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "lift_speed", property = "liftSpeed", jdbcType = JdbcType.DOUBLE),
            @Result(column = "lift_id", property = "liftId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "building_num", property = "buildingNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "ladder_num", property = "ladderNum", jdbcType = JdbcType.INTEGER),
            @Result(column = "lift_brand", property = "liftBrand", jdbcType = JdbcType.VARCHAR),
            @Result(column = "factory_num", property = "factoryNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "lifting_height", property = "liftingHeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "well_height", property = "wellHeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "top_floor_height", property = "topFloorHeight", jdbcType = JdbcType.DOUBLE),
            @Result(column = "main_engine", property = "mainEngine", jdbcType = JdbcType.DOUBLE),
            @Result(column = "st_communication", property = "stCommunication", jdbcType = JdbcType.VARCHAR),
            @Result(column = "control_model", property = "controlModel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "in_dim", property = "inDim", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CZM", property = "czm", jdbcType = JdbcType.VARCHAR),
            @Result(column = "certificate_num", property = "certificateNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "governor_num", property = "governorNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "tractor_num", property = "tractorNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "brake_num", property = "brakeNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ucmp_num", property = "ucmpNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "car_buffer_num", property = "carBufferNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "date_delivery", property = "dateDelivery", jdbcType = JdbcType.DATE),
            @Result(column = "date_install", property = "dateInstall", jdbcType = JdbcType.DATE),
            @Result(column = "date_finish", property = "dateFinish", jdbcType = JdbcType.DATE),
            @Result(column = "lift_count", property = "liftCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "lift_price", property = "liftPrice", jdbcType = JdbcType.DOUBLE),
            @Result(column = "p_num", property = "pNum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "out_dim", property = "outDim", jdbcType = JdbcType.VARCHAR)
    })
    List<DetailLift> selectAll();

    @Update({
            "update detail_lift",
            "set lift_type = #{liftType,jdbcType=VARCHAR},",
            "lift_model = #{liftModel,jdbcType=VARCHAR},",
            "device_code = #{deviceCode,jdbcType=VARCHAR},",
            "dead_weight = #{deadWeight,jdbcType=DOUBLE},",
            "lift_speed = #{liftSpeed,jdbcType=DOUBLE},",
            "lift_id = #{liftId,jdbcType=VARCHAR},",
            "building_num = #{buildingNum,jdbcType=INTEGER},",
            "ladder_num = #{ladderNum,jdbcType=INTEGER},",
            "lift_brand = #{liftBrand,jdbcType=VARCHAR},",
            "factory_num = #{factoryNum,jdbcType=VARCHAR},",
            "lifting_height = #{liftingHeight,jdbcType=DOUBLE},",
            "well_height = #{wellHeight,jdbcType=DOUBLE},",
            "top_floor_height = #{topFloorHeight,jdbcType=DOUBLE},",
            "main_engine = #{mainEngine,jdbcType=DOUBLE},",
            "st_communication = #{stCommunication,jdbcType=VARCHAR},",
            "control_model = #{controlModel,jdbcType=VARCHAR},",
            "in_dim = #{inDim,jdbcType=VARCHAR},",
            "CZM = #{czm,jdbcType=VARCHAR},",
            "certificate_num = #{certificateNum,jdbcType=VARCHAR},",
            "governor_num = #{governorNum,jdbcType=VARCHAR},",
            "tractor_num = #{tractorNum,jdbcType=VARCHAR},",
            "brake_num = #{brakeNum,jdbcType=VARCHAR},",
            "ucmp_num = #{ucmpNum,jdbcType=VARCHAR},",
            "car_buffer_num = #{carBufferNum,jdbcType=VARCHAR},",
            "date_delivery = #{dateDelivery,jdbcType=DATE},",
            "date_install = #{dateInstall,jdbcType=DATE},",
            "date_finish = #{dateFinish,jdbcType=DATE},",
            "lift_count = #{liftCount,jdbcType=INTEGER},",
            "lift_price = #{liftPrice,jdbcType=DOUBLE},",
            "p_num = #{pNum,jdbcType=VARCHAR},",
            "out_dim = #{outDim,jdbcType=VARCHAR}",
            "where lift_num = #{liftNum,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DetailLift record);
}