package generator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.PathUtil;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pengjian
 * @since 2022-07-29
 */
public class HtmlGeneratorDemo {

    public static void main(String[] args) throws Exception {
        String outputFile = PathUtil.getDemoFilePath()+ "HtmlGeneratorDemo.pdf";
        Map<String, Object> variables = new HashMap<String, Object>(3);

        List<User> userList = new ArrayList<User>();

        User tom = new User("Tom", 19, 1);
        User amy = new User("Amy", 28, 0);
        User leo = new User("Leo", 23, 1);

        userList.add(tom);
        userList.add(amy);
        userList.add(leo);

        variables.put("title", "用户列表");
        variables.put("list", userList);

        String htmlStr = HtmlGenerator.generate("HtmlGeneratorDemo.html", variables);
        OutputStream out = new FileOutputStream(outputFile);
        PdfGenerator.generatePlus(htmlStr, out);


    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class User{
    private String name;
    private int age;
    private int sex;
}
