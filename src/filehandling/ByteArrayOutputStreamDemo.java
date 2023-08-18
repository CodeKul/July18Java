package filehandling;

import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("test5.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("test6.txt");
            ByteArrayOutputStream obj = new ByteArrayOutputStream();

            String str = "Welcome";
            byte[] arr = str.getBytes();
            obj.write(arr);
            obj.writeTo(fileOutputStream1);
            obj.writeTo(fileOutputStream2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream1 = new FileInputStream("test5.txt");
            FileInputStream fileInputStream2 = new FileInputStream("test6.txt");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);
//            SequenceInputStream sequenceInputStream2 = new SequenceInputStream(sequenceInputStream,fileInputStream2);

            int i = sequenceInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = sequenceInputStream.read();
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
