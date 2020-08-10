package com.example.service.implement;

import com.example.bean.User;
import com.example.mapper.UserMapper;
import com.example.service.declaration.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据库操作具体实现
 * @author pc
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * id查询用户
     *
     * @param id 用户id
     * @return 查到的用户
     */
    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    /**
     * 查询所有用户数据
     *
     * @return 用户数据List
     */
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    /**
     * 添加用户
     *
     * @param user 要添加的用户
     * @return 添加结果
     */
    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    /**
     * 修改用户
     *
     * @param id   要修改用户id
     * @param user 修改的用户目标信息
     * @return 修改结果
     */
    @Override
    public int update(int id, User user) {
        return userMapper.update(id,user);
    }
}
