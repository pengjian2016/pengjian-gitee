package generator;

import freemarker.template.Configuration;
import utils.PathUtil;

import java.io.File;
import java.io.IOException;

/**
 * @author pengjian
 * @since 2022-07-29
 */
public class FreemarkerConfiguration {

    private static Configuration config = null;

    static {
        config = new Configuration(Configuration.getVersion());
        try {
            config.setDirectoryForTemplateLoading(new File(PathUtil.getTemplatePath()));
            config.setDefaultEncoding("utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getConfiguation() {
        return config;
    }
}
