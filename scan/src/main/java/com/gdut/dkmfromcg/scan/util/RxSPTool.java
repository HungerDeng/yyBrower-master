package com.gdut.dkmfromcg.scan.util;

/**
 * Created by dkmFromCG on 2018/1/28.
 * function:
 */

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences工具类
 * Created by vondear on 2016/1/24.
 */
public class RxSPTool {
    /**
     * 存入自定义的标识的数据 可以近似的看作网络下载数据的缓存
     * 单条方式存入
     *
     * @param context 使用的上下文
     * @param tag     存入内容的标记，约定俗成的tag用当前的类名命名来区分不同的sp
     * @param content 存入的内
     */
    public static void putContent(Context context, String tag, String content) {
        putString(context, tag, content);
    }

    /**
     * SP中写入String类型value
     *
     * @param key   键
     * @param value 值
     */
    public static void putString(Context context, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * 获取以tag命名的存储内
     *
     * @param context 当前调用的上下文
     * @param tag     命名的tag
     * @return 返回以tag区分的内容，默认为空
     */
    public static String getContent(Context context, String tag) {
        return getString(context, tag);
    }

    /**
     * SP中读取String
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static String getString(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        String value;
        value = sp.getString(key, "");
        return value;
    }
}
