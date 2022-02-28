package com.pengjian.edu.common.utils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pengjian.edu.pojo.TUser;

/**
 * @author MRT
 * @date 2022/2/12 12:37
 */
public class WrapperUtils {

    public static QueryWrapper withoutPasswdSalt(){
        QueryWrapper<TUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.select(TUser.class,
                info-> !"password".equals(info.getColumn())&&
                        !"salt".equals(info.getColumn()));
        return queryWrapper;
    }
}
