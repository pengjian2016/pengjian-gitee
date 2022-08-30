package guava;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import java.util.List;
import java.util.Map;

/**
 * @author pengjian
 * @since 2022-08-26
 */
public class SplitterDemo {
    @Test
    public void testSplitter(){
        List<String> stringList = Splitter.on('-').splitToList(new String("1-2-3-4-5-6"));
        System.out.println(stringList);

        String str = "xiaoming=11,xiaohong=23";
        Map<String, String> split = Splitter.on(',').withKeyValueSeparator("=").split(str);
        System.out.println(split);



    }
    @Test
    public void testSplitter2(){
        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println(Strings.isNullOrEmpty(null));

        Preconditions.checkArgument(1 > 2, "Invalid Key Exception");

    }

}
