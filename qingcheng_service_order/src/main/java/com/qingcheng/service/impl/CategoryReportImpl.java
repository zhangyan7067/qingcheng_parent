package com.qingcheng.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qingcheng.dao.CategoryReportMapper;
import com.qingcheng.pojo.order.CategoryReport;
import com.qingcheng.service.order.CategoryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @author zhangyan
 * @version 1.0
 * @date 2019/7/16 16:59
 */

@Service(interfaceClass =CategoryReportService.class)
public class CategoryReportImpl implements CategoryReportService {
    @Autowired
    private CategoryReportMapper categoryReportMapper;

    @Override
    public List<CategoryReport> categoryReport(LocalDate date) {
        return   categoryReportMapper.categoryReport(date);


    }

    @Override
    @Transactional(rollbackFor = {})
    public void createData() {
        LocalDate date= LocalDate.now().minusDays(1);
        List<CategoryReport> categoryReports = categoryReportMapper.categoryReport(date);
        for (CategoryReport categoryReport : categoryReports) {
            categoryReportMapper.insert(categoryReport);
        }
    }

    @Override
    public List<Map> categoryReport1(String date1, String date2) {
        return categoryReportMapper.categoryReport1(date1,date2);
    }
}
