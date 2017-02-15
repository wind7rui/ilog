package org.javaq.common.logger.jcl;

import org.apache.commons.logging.LogFactory;
import org.javaq.common.logger.Level;
import org.javaq.common.logger.Logger;
import org.javaq.common.logger.LoggerAdapter;

import java.io.File;

public class JclLoggerAdapter implements LoggerAdapter {

    public Logger getLogger(String key) {
        return new JclLogger(LogFactory.getLog(key));
    }

    public Logger getLogger(Class<?> key) {
        return new JclLogger(LogFactory.getLog(key));
    }

    private Level level;

    private File file;

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
