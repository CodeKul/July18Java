package filehandling;

import java.io.*;

public class BufferDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream(
                    "/home/vaibhav/JavaBatches/July18/src/filehandling/text6.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(obj);
            String str = "Welcome";

            byte[] arr = str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("file write successfully");
            bufferedOutputStream.close();
            obj.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(
                    "/home/vaibhav/JavaBatches/July18/src/filehandling/text.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int ch = bufferedInputStream.read();
            while (ch != -1){
                System.out.print((char) ch);
                ch = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
