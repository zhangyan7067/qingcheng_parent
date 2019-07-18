package com.qingcheng.service.user;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.user.Provinces;

import java.util.*;

/**
 * provinces业务逻辑层
 */
public interface ProvincesService {


    List<Provinces> findAll();


    PageResult<Provinces> findPage(int page, int size);


    List<Provinces> findList(Map<String, Object> searchMap);


    PageResult<Provinces> findPage(Map<String, Object> searchMap, int page, int size);


    Provinces findById(String provinceid);

    void add(Provinces provinces);


    void update(Provinces provinces);


    void delete(String provinceid);

}
