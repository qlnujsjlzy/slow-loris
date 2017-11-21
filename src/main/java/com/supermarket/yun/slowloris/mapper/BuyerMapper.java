package com.supermarket.yun.slowloris.mapper;

import com.supermarket.yun.slowloris.domain.Buyer;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface BuyerMapper {
    /**
     * @mbg.generated 2017-11-13 51:21:228
     */
    @Delete({
            "delete from buyer",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:228
     */
    @Insert({
            "insert into buyer (wechat_id, nick_name, ",
            "phone, salt, image, ",
            "create_by, create_time, ",
            "update_by, update_time, ",
            "status, remarks)",
            "values (#{wechatId,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
            "#{phone,jdbcType=VARCHAR}, #{salt,jdbcType=VARCHAR}, #{image,jdbcType=VARCHAR}, ",
            "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
            "#{status,jdbcType=INTEGER}, #{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Buyer record);

    /**
     * @mbg.generated 2017-11-13 51:21:228
     */
    @Select({
            "select",
            "id, wechat_id, nick_name, phone, salt, image, create_by, create_time, update_by, ",
            "update_time, status, remarks",
            "from buyer",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "wechat_id", property = "wechatId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nick_name", property = "nickName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "salt", property = "salt", jdbcType = JdbcType.VARCHAR),
            @Result(column = "image", property = "image", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    Buyer selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2017-11-13 51:21:228
     */
    @Select({
            "select",
            "id, wechat_id, nick_name, phone, salt, image, create_by, create_time, update_by, ",
            "update_time, status, remarks",
            "from buyer"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "wechat_id", property = "wechatId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nick_name", property = "nickName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "salt", property = "salt", jdbcType = JdbcType.VARCHAR),
            @Result(column = "image", property = "image", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR)
    })
    List<Buyer> selectAll();

    /**
     * @mbg.generated 2017-11-13 51:21:228
     */
    @Update({
            "update buyer",
            "set wechat_id = #{wechatId,jdbcType=VARCHAR},",
            "nick_name = #{nickName,jdbcType=VARCHAR},",
            "phone = #{phone,jdbcType=VARCHAR},",
            "salt = #{salt,jdbcType=VARCHAR},",
            "image = #{image,jdbcType=VARCHAR},",
            "create_by = #{createBy,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_by = #{updateBy,jdbcType=VARCHAR},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "status = #{status,jdbcType=INTEGER},",
            "remarks = #{remarks,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Buyer record);
}