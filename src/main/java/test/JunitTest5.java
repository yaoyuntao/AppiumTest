package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * JUnit Suite Test
 * @author yiibai
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FaMingPian.class,
        SendMsgs.class
})
public class JunitTest5 {
}