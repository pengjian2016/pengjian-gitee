package guava;

import com.google.common.base.CharMatcher;
import org.testng.annotations.Test;

/**
 * @author pengjian
 * @since 2022-08-26
 */
public class CharMatcherDemo {
    @Test
    public void testCharMatcher() {
        CharMatcher matcher = CharMatcher.any();
        matcher.matches('a');
        matcher.matches('b');
        matcher.matches('c');
        matcher.matches('d');
    }
}
