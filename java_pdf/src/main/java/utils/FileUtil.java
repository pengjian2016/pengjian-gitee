package utils;

import java.io.File;
import java.io.IOException;

/**
 * @author pengjian
 * @since 2022-07-28
 */
public class FileUtil extends  cn.hutool.core.io.FileUtil {

    public static void open_directory(String folder) {
        File file = new File(folder);
        if (!file.exists()) {
            return;
        }
        Runtime runtime = null;
        try {
            runtime = Runtime.getRuntime();
            if (!cn.hutool.core.io.FileUtil.isWindows()) {
                // System.out.println("is linux");
                runtime.exec("nautilus " + folder);
            } else {
                runtime.exec("cmd /c start explorer " + folder);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (null != runtime) {
                runtime.runFinalization();
            }
        }
    }


    public static void open_file(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return;
        }
        Runtime runtime = null;
        try {
            runtime = Runtime.getRuntime();
            if (!cn.hutool.core.io.FileUtil.isWindows()) {
                // System.out.println("is linux");
                runtime.exec("nautilus " + filePath);
            } else {
                runtime.exec("cmd /c start explorer /select,/e, " + filePath);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (null != runtime) {
                runtime.runFinalization();
            }
        }
    }


}
