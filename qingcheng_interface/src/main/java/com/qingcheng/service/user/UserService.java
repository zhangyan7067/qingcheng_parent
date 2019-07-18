package com.qingcheng.service.user;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.user.User;

import java.util.*;

/**
 * user业务逻辑层
 */

public interface UserService {


    List<User> findAll();


    PageResult<User> findPage(int page, int size);


    List<User> findList(Map<String, Object> searchMap);


    PageResult<User> findPage(Map<String, Object> searchMap, int page, int size);


    User findById(String username);

    void add(User user);


    void update(User user);


    void delete(String username);

}
