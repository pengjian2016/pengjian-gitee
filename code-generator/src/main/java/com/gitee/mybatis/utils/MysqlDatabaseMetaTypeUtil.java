package com.gitee.mybatis.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Mysql DatabaseMeta类型工具
 * Created by HuJiFang on 2018/3/4.
 */
public class MysqlDatabaseMetaTypeUtil {
    /**
     * 是否是数字类型的字段
     *
     * @param type 字段类型
     * @return
     */
    public static boolean isNumberType(String type) {
        if (StringUtils.isBlank(type)) {
            return false;
        }
        List<String> numberTypeList = Arrays.asList("Integer", "Long", "Double", "BigDecimal");
        for (String numberType:numberTypeList){
            if(StringUtils.equalsIgnoreCase(numberType,type)){
                return true;
            }
        }
        return false;
    }

}
