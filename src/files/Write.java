package files;
import java.io.*;
import java.io.FileWriter;

public class Write {

    public static void main(String[] args){

        //1. Define the path that we want to write
        String filename = "/Users/faisalabdulkadir/Desktop/Java Project/JavaTraining/src/files/FileToWrite.txt";
        String message = " i am writing data that will be placed to a file";
        //2. Create the file in java
        File file = new File(filename);


        //FileWriter fw = null;
        try {
            //3. Open the file
            FileWriter fw = new FileWriter(file);
            //4. write to the file
            fw.write(message);
            //5. close the resources
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: could not read file: " + filename);
            e.printStackTrace();
        }finally {
            System.out.println("Closing the fileWriter");
        }





    }
}
