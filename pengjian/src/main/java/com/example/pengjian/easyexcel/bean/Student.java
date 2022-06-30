package com.example.pengjian.easyexcel.bean;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.util.Date;

/**
 * @author pengjian
 * @since 2022-06-22
 */
@Data
//@ColumnWidth(10)
//@HeadRowHeight(10)
//@ContentRowHeight(50)
public class Student {
    @ExcelProperty(value = "Id")
    @ExcelIgnore
    private String id;

    @ExcelProperty(value = "学生姓名",index = 1)
    private String name;

    @ExcelProperty(value = "性别",index = 0)
    private String gender;

    @ExcelProperty(value = "出生日期",index = 2)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ColumnWidth(50)
    private Date birthday;


}
