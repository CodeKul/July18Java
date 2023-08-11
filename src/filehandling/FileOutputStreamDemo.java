package filehandling;

import java.io.*;

public class FileOutputStreamDemo {

    public static void main(String[] args) {

//        File file = new File("");
        try {
            FileOutputStream obj = new FileOutputStream(
                    "/home/vaibhav/JavaBatches/July18/src/filehandling/text.txt");
            String str = "Welcome";
            byte[] arr = str.getBytes();
            obj.write(arr);
//            char[] chars = str.toCharArray();

            System.out.println("file write successfully");
            obj.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(
                    "/home/vaibhav/JavaBatches/July18/src/filehandling/text.txt");
            int ch = fileInputStream.read();
            while (ch != -1){
                System.out.print((char) ch);
                ch = fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
