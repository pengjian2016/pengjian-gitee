package com.example.pengjian.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.example.pengjian.easyexcel.bean.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author pengjian
 * @since 2022-06-22
 */
public class EasyExcelDemo {
    public static void main(String[] args){
//        readMethod();
        writeMethod();

    }

    private static void writeMethod() {
        String path = "E:\\IDEA_workspace\\pengjian-gitee\\pengjian\\src\\main\\java\\com\\example\\pengjian\\easyexcel\\xls\\Student-write.xlsx";
        ExcelWriterBuilder write = EasyExcel.write(path, Student.class);
        ExcelWriterSheetBuilder sheet = write.sheet();
        sheet.doWrite(initDate());
    }

    public static List<Student> initDate(){
        ArrayList<Student> students=new ArrayList<>();
        Student stu=new Student();
        for (int i = 0; i <10 ; i++) {
            stu.setName("学生000"+i);
            stu.setBirthday(new Date());
            stu.setGender("男");
            students.add(stu);
        }
        return students;
    }

    private static void readMethod() {
        String path = "E:\\IDEA_workspace\\pengjian-gitee\\pengjian\\src\\main\\java\\com\\example\\pengjian\\easyexcel\\xls\\Student.xlsx";
        ExcelReaderBuilder readerBuilder = EasyExcel.read(path, Student.class, new ReadListener() {
            @Override
            public void invoke(Object data, AnalysisContext context) {
                Student t = (Student) data;
                System.out.println(t);
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {
                System.out.println("当Excel读取完成之后回调");
            }
        });

        ExcelReaderSheetBuilder sheet = readerBuilder.sheet();
        sheet.doRead();
    }


}
