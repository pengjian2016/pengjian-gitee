package fastjson2;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 *
 * @author pengjian
 * @since 2022-12-06
 */
@Slf4j
public class JsonDemo {

    @Test
    public void test() {
        JSONObject info = new JSONObject();
        info.put("name", "张三");
        info.put("age", "18");
        info.put("地理", "70");
        info.put("英语", "60");
        System.out.println(info);

        String string = JSON.toJSONString(info);
        System.out.println(string);

        JSONObject jsonObject = JSONObject.parseObject(string);
        System.out.println(jsonObject);


    }

    @Test
    public void test1(){
        JSONArray array = new JSONArray();
        array.add("1班");
        array.add("2班");
        array.add("3班");
        JSONObject school = new JSONObject();
        school.put("schoolName", "第一中学");
        school.put("teacher", "刘梅");

        JSONObject info = new JSONObject();
        info.put("name", "张三");
        info.put("age", "18");
        info.put("gradle",array);
        info.put("schoolInfo",school);

        //从info中取值
        System.out.println(info.getString("name")); //张三
        System.out.println(info.getIntValue("age"));//18
        System.out.println(info.getJSONArray("gradle"));//["1班","2班","3班"]
        System.out.println(info.getJSONObject("schoolInfo"));//{"schoolName":"第一中学","teacher":"刘梅"}

    }





}
