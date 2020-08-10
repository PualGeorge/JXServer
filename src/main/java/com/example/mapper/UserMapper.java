package com.example.mapper;

import com.example.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 数据库操作接口
 * @author pc
 * @since 2020/8/8
 */
@Mapper
@Component
public interface UserMapper {
    /**
     * id查询用户
     * @param id 用户id
     * @return 查到的用户
     */
    @Select("SELECT * FROM userinfo WHERE id = #{id}")
    User getUserById(int id);

    /**
     * 查询所有用户数据
     * @return 用户数据List
     */
    @Select("SELECT * FROM userinfo")
    public List<User> getUserList();

    /**
     * 添加用户
     * @param user 要添加的用户
     * @return 添加结果
     */
    @Insert("insert into userinfo(id,username,password,collect,jvalues,credit) values(#{id},#{username},#{password},#{collect},#{jvalues},#{credit})")
    public int add(User user);

    /**
     * 修改用户
     * @param id 要修改用户id
     * @param user 修改的用户目标信息
     * @return 修改结果
     */
    @Update("update userinfo set username=#{user.username},password=#{user.password}," +
            "collect=#{user.collect},jvaluse=#{user.jvalues},credit=#{user.credit} where" +
            " id=#{id}")
    public int update(@Param("id") int id, @Param("user") User user);
}
