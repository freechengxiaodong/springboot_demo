package springboot.springboot.service.impl;

import springboot.springboot.mapper.UserMapper;
import springboot.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 我命倾尘
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int getAgeByUsername(String username) {
        return userMapper.getAgeByUsername(username);
    }
}
