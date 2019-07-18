package com.qingcheng.service.order;

import com.qingcheng.pojo.order.CategoryReport;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface CategoryReportService {

    public List<CategoryReport> categoryReport(LocalDate date);
    public void createData();
    List<Map> categoryReport1(String date1, String date2);
}
