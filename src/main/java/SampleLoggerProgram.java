import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class SampleLoggerProgram{

    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(SampleLoggerProgram.class.getName());

    public static void solution(){
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}