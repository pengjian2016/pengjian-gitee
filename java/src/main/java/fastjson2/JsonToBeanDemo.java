package fastjson2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 *
 * @author pengjian
 * @since 2022-12-07
 */
public class JsonToBeanDemo {
    @Test
    public void  test1() throws Exception {
        JsonBean jsonBean = new JsonBean();
        jsonBean.setId(1);
        jsonBean.setId2(2);
        jsonBean.setId3("string");
        jsonBean.setId4(new String[]{"array-string"});
        jsonBean.setId5(YesOrNoEnum.YES);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(jsonBean);
        System.out.println(s);



    }

    //
    //
    //
    // https://developer.adobe.com/experience-manager/reference-materials/6-5/javadoc/com/fasterxml/jackson/databind/DeserializationFeature.html#:~:text=Feature%20that%20determines%20whether%20encountering%20of%20JSON%20null,to%20be%20used%20for%20deserializing%20Java%20enum%20values.
    //
    //
    @Test
    public void  test2() throws Exception {
        String json  = "{\n" +
                "  \"id\": 1,\n" +
                "  \"id2\": 2,\n" +
                "  \"id3\": \"string\",\n" +
                "  \"id4\": [\"array-string\"],\n" +
                //"  \"id4\": \"\",\n" +
                //"  \"id4\": \"arr\",\n" +
                //"  \"id5\": \"YES111\",\n" +
                "  \"id666\": \"errer\"\n" +
                "  \n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        // json中多余的属性不报错
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //枚举多了的报错
        //objectMapper.configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, true);

        //允许将未知枚举值解析为空值的功能。
        objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);

        //确定遇到未知属性（未映射到属性的属性，并且没有可以处理它的“任何设置器”或处理程序）是否应该导致失败（通过抛出 JsonMappingException）的功能。
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        //确定强制非数组（JSON 格式）值与 Java 集合（数组、java.util.Collection）类型一起使用是否可接受的功能。
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, false);


        //反序列化是是否允许属性名称不带双引号
        //objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);


        //在序列化时忽略值为 null 的属性
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //忽略值为默认值的属性
        objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);

        JsonBean jsonBean = objectMapper.readValue(json, JsonBean.class);
        System.out.println(jsonBean);

    }



}

class JsonBean {
    int id;
    Integer id2;
    String  id3;
    String[]  id4;
    YesOrNoEnum id5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public String getId3() {
        return id3;
    }

    public void setId3(String id3) {
        this.id3 = id3;
    }

    public String[] getId4() {
        return id4;
    }

    public void setId4(String[] id4) {
        this.id4 = id4;
    }

    public YesOrNoEnum getId5() {
        return id5;
    }

    public void setId5(YesOrNoEnum id5) {
        this.id5 = id5;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "id=" + id +
                ", id2=" + id2 +
                ", id3='" + id3 + '\'' +
                ", id4=" + Arrays.toString(id4) +
                ", id5=" + id5 +
                '}';
    }
}


enum YesOrNoEnum {

    NO("否"),
    YES("是");
    private final String alias;

    YesOrNoEnum(String alias) {
        this.alias = alias;
    }
    public String getDesc() {
        return this.alias;
    }
}
