package com.qingcheng.service.goods;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;

import java.util.*;

/**
 * brand业务逻辑层
 */
public interface BrandService {


    List<Brand> findAll();


    PageResult<Brand> findPage(int page, int size);


    List<Brand> findList(Map<String, Object> searchMap);


    PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size);


    Brand findById(Integer id);

    void add(Brand brand);


    void update(Brand brand);


    void delete(Integer id);

}
