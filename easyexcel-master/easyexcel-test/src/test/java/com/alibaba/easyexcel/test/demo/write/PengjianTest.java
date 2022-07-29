package com.alibaba.easyexcel.test.demo.write;

import com.alibaba.easyexcel.test.util.TestFileUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author pengjian
 * @since 2022-07-25
 */
@Ignore
public class PengjianTest {


    @Test
    public void simpleWrite() {
        // 写法2
        String fileName = TestFileUtil.getPath() + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
        EasyExcel.write(fileName, DemoData.class).sheet("模板")
            .registerWriteHandler(new PengjianAutomaticWidth())
            .registerWriteHandler(PengjianRegisterWriteHandler.getStyleStrategy())
            .doWrite(data());

    }

    private List<DemoData> data() {
        List<DemoData> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }
}
