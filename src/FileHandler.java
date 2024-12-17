import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandler {

    public static void writeLog(String text) {
        try {//+
            File logFile = new File("log.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);
            fileWriter.write(text + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}

