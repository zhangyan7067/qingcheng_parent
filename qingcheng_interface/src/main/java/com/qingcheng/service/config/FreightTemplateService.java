package com.qingcheng.service.config;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.config.FreightTemplate;

import java.util.*;

/**
 * freightTemplate业务逻辑层
 */
public interface FreightTemplateService {


    List<FreightTemplate> findAll();


    PageResult<FreightTemplate> findPage(int page, int size);


    List<FreightTemplate> findList(Map<String, Object> searchMap);


    PageResult<FreightTemplate> findPage(Map<String, Object> searchMap, int page, int size);


    FreightTemplate findById(Integer id);

    void add(FreightTemplate freightTemplate);


    void update(FreightTemplate freightTemplate);


    void delete(Integer id);

}
