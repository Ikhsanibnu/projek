import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ReadStringByChar {
    public static void main(String[] args) {
        try {
            Scanner inputData = new Scanner(System.in);
            String directory = System.getProperty("user.dir");
            System.out.println("Current directory => " + directory);
            System.out.print("Type Filename = ");
            String filename = inputData.nextLine();
            System.out.print("Type Directory = ");
            String dirname = inputData.nextLine();
            if ((filename.isEmpty()) || (dirname.isEmpty())) {
                System.out.println("Process Cannot Continue...");
                System.exit(0);
            }
            File myFile = new File(dirname + "/" + filename);
            if (myFile.exists()) {
                FileReader fr = new FileReader(dirname + "/" + filename);
                System.out.println("file content: ");
                int r = 0;
                while ((r = fr.read()) != -1) ;
                {
                    System.out.print((char) r);
                    TimeUnit.MILLISECONDS.sleep(120);
                }
            } else {
                System.out.println("File does not exit...");
                System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
