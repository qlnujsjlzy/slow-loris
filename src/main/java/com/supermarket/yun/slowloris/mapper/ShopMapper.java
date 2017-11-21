package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Shop;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface ShopMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:473
     */
    @Delete({
            "delete from shop",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:473
     */
    @Insert({
            "insert into shop (community_id, community_name, ",
            "name, address, coordinate, ",
            "contacts, phone, ",
            "shop_hours, credit_line, ",
            "business_license, food_distribution_license, ",
            "bank_name, bank_code, ",
            "audit_status, create_by, ",
            "create_time, update_by, ",
            "update_time, flag, ",
            "remarks)",
            "values (#{communityId,jdbcType=INTEGER}, #{communityName,jdbcType=VARCHAR}, ",
            "#{name,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, #{coordinate,jdbcType=VARCHAR}, ",
            "#{contacts,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
            "#{shopHours,jdbcType=VARCHAR}, #{creditLine,jdbcType=INTEGER}, ",
            "#{businessLicense,jdbcType=VARCHAR}, #{foodDistributionLicense,jdbcType=VARCHAR}, ",
            "#{bankName,jdbcType=VARCHAR}, #{bankCode,jdbcType=VARCHAR}, ",
            "#{auditStatus,jdbcType=INTEGER}, #{createBy,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{flag,jdbcType=INTEGER}, ",
            "#{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Shop record);

    /**
     * @mbg.generated 2017-11-13 51:21:473
     */
    @Select({
            "select",
            "id, community_id, community_name, name, address, coordinate, contacts, phone, ",
            "shop_hours, credit_line, business_license, food_distribution_license, bank_name, ",
            "bank_code, audit_status, create_by, create_time, update_by, update_time, flag, ",
            "remarks",
            "from shop",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "community_id", property = "communityId", jdbcType = JdbcType.INTEGER),
            @Result(column = "community_name", property = "communityName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "coordinate", property = "coordinate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "contacts", property = "contacts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shop_hours", property = "shopHours", jdbcType = JdbcType.VARCHAR),
            @Result(column = "credit_line", property = "creditLine", jdbcType = JdbcType.INTEGER),
            @Result(column = "business_license", property = "businessLicense", jdbcType = JdbcType.VARCHAR),
            @Result(column = "food_distribution_license", property = "foodDistributionLicense", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bank_name", property = "bankName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bank_code", property = "bankCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "audit_status", property = "auditStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    Shop selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:473
     */
    @Select({
            "select",
            "id, community_id, community_name, name, address, coordinate, contacts, phone, ",
            "shop_hours, credit_line, business_license, food_distribution_license, bank_name, ",
            "bank_code, audit_status, create_by, create_time, update_by, update_time, flag, ",
            "remarks",
            "from shop"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "community_id", property = "communityId", jdbcType = JdbcType.INTEGER),
            @Result(column = "community_name", property = "communityName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "coordinate", property = "coordinate", jdbcType = JdbcType.VARCHAR),
            @Result(column = "contacts", property = "contacts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shop_hours", property = "shopHours", jdbcType = JdbcType.VARCHAR),
            @Result(column = "credit_line", property = "creditLine", jdbcType = JdbcType.INTEGER),
            @Result(column = "business_license", property = "businessLicense", jdbcType = JdbcType.VARCHAR),
            @Result(column = "food_distribution_license", property = "foodDistributionLicense", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bank_name", property = "bankName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "bank_code", property = "bankCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "audit_status", property = "auditStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<Shop> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:473
     */
    @Update({
            "update shop",
            "set community_id = #{communityId,jdbcType=INTEGER},",
            "community_name = #{communityName,jdbcType=VARCHAR},",
            "name = #{name,jdbcType=VARCHAR},",
            "address = #{address,jdbcType=VARCHAR},",
            "coordinate = #{coordinate,jdbcType=VARCHAR},",
            "contacts = #{contacts,jdbcType=VARCHAR},",
            "phone = #{phone,jdbcType=VARCHAR},",
            "shop_hours = #{shopHours,jdbcType=VARCHAR},",
            "credit_line = #{creditLine,jdbcType=INTEGER},",
            "business_license = #{businessLicense,jdbcType=VARCHAR},",
            "food_distribution_license = #{foodDistributionLicense,jdbcType=VARCHAR},",
            "bank_name = #{bankName,jdbcType=VARCHAR},",
            "bank_code = #{bankCode,jdbcType=VARCHAR},",
            "audit_status = #{auditStatus,jdbcType=INTEGER},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "flag = #{flag,jdbcType=INTEGER},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Shop record);
}