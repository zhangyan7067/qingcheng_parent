package com.qingcheng.pojo.order;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (TbCategoryReport)实体类
 *
 * @author makejava
 * @since 2019-07-16 16:32:58
 */
@Table(name="tb_category_report")
public class CategoryReport implements Serializable {
    private static final long serialVersionUID = 580294581751238564L;
    //1级分类
    @Id
    private Integer categoryId1;
    //2级分类
    @Id
    private Integer categoryId2;
    //3级分类
    @Id
    private Integer categoryId3;
    //统计日期
    @Id
    private Date countDate;
    //销售数量

    private Integer num;
    //销售额
    private Integer money;


    public Integer getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(Integer categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public Integer getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(Integer categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public Integer getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(Integer categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public Date getCountDate() {
        return countDate;
    }

    public void setCountDate(Date countDate) {
        this.countDate = countDate;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

}