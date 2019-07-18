package com.qingcheng.service.system;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.system.Menu;

import java.util.*;

/**
 * menu业务逻辑层
 */
public interface MenuService {


    List<Menu> findAll();


    PageResult<Menu> findPage(int page, int size);


    List<Menu> findList(Map<String, Object> searchMap);


    PageResult<Menu> findPage(Map<String, Object> searchMap, int page, int size);


    Menu findById(String id);

    void add(Menu menu);


    void update(Menu menu);


    void delete(String id);
    List<Map> findAllMenu();
}
