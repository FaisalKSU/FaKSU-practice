package dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    public static void main(String[] args){
        //This method will read data from a csv file

        List<String[]> data = new ArrayList<String[]>();
        String fileName = "/Users/faisalabdulkadir/Desktop/Java Project/JavaTraining/src/dataStructures/accounts.csv";
        String testrow;
        try {
            //open the file
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            // read the data as long as it's not empty
            while((testrow = br.readLine()) != null){
                //parse the data by comas
                String[] line = testrow.split(",");
                //add the data to collection
                data.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(data); we can't print collections of arrays, so we will have to iterate
        for (String[] accounts : data){
            System.out.print("[ ");
            for(String field : accounts){
                System.out.print(field + " ");
            }

            System.out.println(" ] ");
        }


    }
}
