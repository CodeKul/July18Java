package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TyrWithResources {

    public static void main(String[] args) {

        try(FileWriter fileWriter=new FileWriter(
                "/home/vaibhav/JavaBatches/July18/src/filehandling/test2.txt")) {
            fileWriter.write("Welcome");
            System.out.println("file write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader =new FileReader("/home/vaibhav/JavaBatches/July18/src/filehandling/test2.txt")){
            int i = fileReader.read();
            while (i>0){
                System.out.println((char) i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
