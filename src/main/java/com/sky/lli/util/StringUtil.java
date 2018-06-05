package com.sky.lli.util;

import java.io.Serializable;

/**
 * 描述：字符串工具类
 * CLASSPATH: com.sky.lli.util.StringUtil.java
 * VERSION:   1.0
 * Created by lihao
 * DATE:      2018/1/14
 */
public class StringUtil implements Serializable {

    private StringUtil() {
    }

    /**
     * 方法说明 : 判断字符串是否为 null 或空字符串，只有空格等视为空字符串
     * <p>
     * Author lihao [lihao@sinosoft.com.cn]
     * <p>
     * Date 2017/1/3
     */
    public static boolean isNull(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 方法说明 : 判断字符串是否为空，null、"null"、"NULL"、"Null"、空格等，都视为空字符串
     * <p>
     * Author lihao [lihao@sinosoft.com.cn]
     * <p>
     * Date 2017/1/3
     */
    public static boolean isNullOrNullValue(String str) {
        return str == null || str.trim().length() == 0 || str.trim().equalsIgnoreCase("null");
    }

    /**
     * 方法说明 : 判断两个字符串是否严格相等，任何字符串为空都视为不等，字符串首尾相差空格等字符也视为不等
     * <p>
     * Author lihao [lihao@sinosoft.com.cn]
     * <p>
     * Date 2017/1/3
     */
    public static boolean equals(String str1, String str2) {
        return str1 != null && str2 != null && str1.equals(str2);
    }

    /**
     * 方法说明 : 判断两个字符串是否相等（trim 后比较），任何字符串为空都视为不等，字符串首尾相差空格等字符视为相等
     * <p>
     * Author lihao [lihao@sinosoft.com.cn]
     * <p>
     * Date 2017/1/3
     */
    public static boolean equalsTrim(String str1, String str2) {
        return str1 != null && str2 != null && str1.trim().equals(str2.trim());
    }

    /**
     * 方法说明 : 判断两个字符串是否相等（trim 后比较），两个空字符串视为相等，"null" 等不做为空字符串看待
     * <p>
     * Author lihao [lihao@sinosoft.com.cn]
     * <p>
     * Date 2017/1/3
     */
    public static boolean equalsNull(String str1, String str2) {
        return !isNull(str1) && !isNull(str2) && str1.trim().equals(str2.trim());
    }

    /**
     * 方法说明 : 判断两个字符串是否相等（trim 后比较），两个空字符串视为相等，"null"、"NULL"、"Null" 等都视为空字符串，也视为相等
     * <p>
     * Author lihao [lihao@sinosoft.com.cn]
     * <p>
     * Date 2017/1/3
     */
    public static boolean equalsNullOrNullValue(String str1, String str2) {
        return !isNullOrNullValue(str1) && !isNullOrNullValue(str2) && str1.trim().equals(str2.trim());
    }


}
