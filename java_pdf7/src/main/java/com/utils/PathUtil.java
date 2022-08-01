package com.utils;

import java.io.File;

/**
 * @author pengjian
 * @since 2022-07-28
 */
public class PathUtil {

    public static String getTemplatePath() {
        return "E:\\IDEA_workspace\\pengjian-gitee\\java_pdf7\\template\\";
    }
    public static String getDemoFilePath() {
        return "E:\\IDEA_workspace\\pengjian-gitee\\java_pdf7\\file\\";
    }


    public static String getCurrentPath() {
        Class<?> caller = getCaller();
        if (caller == null) {
            caller = PathUtil.class;
        }
        return getCurrentPath(caller);
    }


    public static Class<?> getCaller() {
        StackTraceElement[] stack = (new Throwable()).getStackTrace();
        if (stack.length < 3) {
            return PathUtil.class;
        }
        String className = stack[2].getClassName();
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getCurrentPath(Class<?> cls) {
        String path = cls.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.replaceFirst("file:/", "");
        path = path.replaceAll("!/", "");
        if (path.lastIndexOf(File.separator) >= 0) {
            path = path.substring(0, path.lastIndexOf(File.separator));
        }
        if ("/".equalsIgnoreCase(path.substring(0, 1))) {
            String osName = System.getProperty("os.name").toLowerCase();
            if (osName.contains("window")) {
                path = path.substring(1);
            }
        }
        return path;
    }


    public static void main(String[] args) {
        String currentPath = PathUtil.getCurrentPath();
        System.out.println(currentPath);
    }
}
