package org.javaq.common.logger;

import org.junit.Test;

public class LogTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test() {
        LOGGER.info("logTest");
    }
}
