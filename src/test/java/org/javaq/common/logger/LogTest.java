package org.javaq.common.logger;

import org.junit.Test;

/**
 * Created by wangxq on 17/2/15.
 */
public class LogTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test() {
        LOGGER.info("logTest");
    }
}
