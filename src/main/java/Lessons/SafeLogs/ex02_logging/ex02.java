package Lessons.SafeLogs.ex02_logging;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ex02 {
    public static void main(String[] args) {
        task12("test");
    }

    static void  task12(String text){
//        логирование  info warning fatal

        Logger logger= Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("src/main/java/Lessons/SafeLogs/ex02_logging/log.tht");
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        try (FileWriter writer = new FileWriter("src/main/java/Lessons/SafeLogs/ex02_logging/text.tht")) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }

        fileHandler.close();
        logger.getHandlers()[0].close();
    }
}

