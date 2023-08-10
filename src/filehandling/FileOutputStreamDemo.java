package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {

//        File file = new File("");
        try {
            FileOutputStream obj = new FileOutputStream("/home/vaibhav/JavaBatches/July18/src/filehandling/text.txt");
            String str = "Welcome";
            byte[] arr = str.getBytes();
            obj.write(arr);

            System.out.println("file write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
