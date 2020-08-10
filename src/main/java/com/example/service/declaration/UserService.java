package com.example.service.declaration;

import com.example.bean.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    /**
            * id查询用户
     * @param id 用户id
     * @return 查到的用户
     */
    User getUserById(int id);

    /**
     * 查询所有用户数据
     * @return 用户数据List
     */
    public List<User> getUserList();

    /**
     * 添加用户
     * @param user 要添加的用户
     * @return 添加结果
     */
    public int add(User user);

    /**
     * 修改用户
     * @param id 要修改用户id
     * @param user 修改的用户目标信息
     * @return 修改结果
     */
    public int update( int id, User user);
}
