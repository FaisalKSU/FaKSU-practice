package files;
import java.io.*;
public class Read {

    public static void main(String[] args){

        //1. Define the file path that we want to read
        String filename = "/Users/faisalabdulkadir/Desktop/Java Project/JavaTraining/src/files/data.txt";
        String text = null;

        //2. Create the file in java
        File file = new File(filename);




        try {
            //3. Open the file
            BufferedReader br = new BufferedReader(new FileReader(file));

            //4. read the file
            text = br.readLine();

            //5. Close the resources
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("error: file not found:" + filename);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("error: could not read the data" + filename);
            e.printStackTrace();
        }finally {
            System.out.println("finished reading the file");
        }
        System.out.println(text);

    }



}
