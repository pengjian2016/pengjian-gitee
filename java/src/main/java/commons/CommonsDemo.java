package commons;

import lombok.SneakyThrows;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;

/**
 * @author pengjian
 * @since 2022-08-26
 */
public class CommonsDemo {
    @Test
    public void StringUtilsDemo() {
        System.out.println(StringUtils.isEmpty(" "));//false
        System.out.println(StringUtils.isEmpty(null));//true
        System.out.println(StringUtils.isBlank(" "));//true
        System.out.println(StringUtils.isBlank(null));//true

        String str = "1234567890";
        System.out.println(StringUtils.abbreviate(str,  8));

        System.out.println(RandomStringUtils.random(10));
    }
    @Test
    public void DateUtilsDemo () throws ParseException, FileNotFoundException {
        Date date = DateUtils.parseDate("2013-08-26 11:00:00", "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
        System.out.println(DateFormatUtils.format(date,"yyyy-MM-dd HH:mm:ss"));
        Date date1 = DateUtils.addDays(date, -1);
        System.out.println(date1);
        System.out.println(DateFormatUtils.format(date1,"yyyy-MM-dd HH:mm:ss"));

    }
    @SneakyThrows
    @Test
    public void ClassUtilsDemo ()  {

    }

}
