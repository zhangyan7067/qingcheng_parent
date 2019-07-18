package com.qingcheng.controller.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.pojo.order.CategoryReport;
import com.qingcheng.service.order.CategoryReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @author zhangyan
 * @version 1.0
 * @date 2019/7/16 17:00
 */
@RestController
@RequestMapping("/categoryReport")
public class CategoryReportController {
    @Reference
    CategoryReportService categoryReportService;

    @RequestMapping("/yesterday")
    public List<CategoryReport> yesterday() {
        LocalDate localDate = LocalDate.now().minusDays(1);
        return categoryReportService.categoryReport(localDate);
    }

     @GetMapping("/categoryReports")
    public List<Map> categoryReports(String date1, String date2) {
       return categoryReportService.categoryReport1(date1,date2);
    }
}
