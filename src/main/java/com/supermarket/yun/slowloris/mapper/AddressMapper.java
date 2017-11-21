package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Address;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface AddressMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:903
     */
    @Delete({
            "delete from address",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:903
     */
    @Insert({
            "insert into address (name, phone, ",
            "province, city, ",
            "region, community_id, ",
            "community_name, street, ",
            "is_default, create_by, ",
            "create_time, update_by, ",
            "update_time, flag)",
            "values (#{name,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
            "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
            "#{region,jdbcType=VARCHAR}, #{communityId,jdbcType=INTEGER}, ",
            "#{communityName,jdbcType=VARCHAR}, #{street,jdbcType=VARCHAR}, ",
            "#{isDefault,jdbcType=INTEGER}, #{createBy,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{flag,jdbcType=INTEGER})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Address record);

    /**
     * @mbg.generated 2017-11-13 51:21:903
     */
    @Select({
            "select",
            "id, name, phone, province, city, region, community_id, community_name, street, ",
            "is_default, create_by, create_time, update_by, update_time, flag",
            "from address",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "province", property = "province", jdbcType = JdbcType.VARCHAR),
            @Result(column = "city", property = "city", jdbcType = JdbcType.VARCHAR),
            @Result(column = "region", property = "region", jdbcType = JdbcType.VARCHAR),
            @Result(column = "community_id", property = "communityId", jdbcType = JdbcType.INTEGER),
            @Result(column = "community_name", property = "communityName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "street", property = "street", jdbcType = JdbcType.VARCHAR),
            @Result(column = "is_default", property = "isDefault", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER)
    })
    Address selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:903
     */
    @Select({
            "select",
            "id, name, phone, province, city, region, community_id, community_name, street, ",
            "is_default, create_by, create_time, update_by, update_time, flag",
            "from address"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "province", property = "province", jdbcType = JdbcType.VARCHAR),
            @Result(column = "city", property = "city", jdbcType = JdbcType.VARCHAR),
            @Result(column = "region", property = "region", jdbcType = JdbcType.VARCHAR),
            @Result(column = "community_id", property = "communityId", jdbcType = JdbcType.INTEGER),
            @Result(column = "community_name", property = "communityName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "street", property = "street", jdbcType = JdbcType.VARCHAR),
            @Result(column = "is_default", property = "isDefault", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER)
    })
    List<Address> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:903
     */
    @Update({
            "update address",
            "set name = #{name,jdbcType=VARCHAR},",
            "phone = #{phone,jdbcType=VARCHAR},",
            "province = #{province,jdbcType=VARCHAR},",
            "city = #{city,jdbcType=VARCHAR},",
            "region = #{region,jdbcType=VARCHAR},",
            "community_id = #{communityId,jdbcType=INTEGER},",
            "community_name = #{communityName,jdbcType=VARCHAR},",
            "street = #{street,jdbcType=VARCHAR},",
            "is_default = #{isDefault,jdbcType=INTEGER},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "flag = #{flag,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Address record);
}