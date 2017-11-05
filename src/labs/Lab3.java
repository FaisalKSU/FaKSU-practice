package labs;
import java.io.*;
public class Lab3 {

    public static void main(String[] args) {
        //Read a file of passwords
        String filename = "/Users/faisalabdulkadir/Desktop/Java Project/JavaTraining/src/labs/passwords.txt";
        String[] passwords = new String[2];

        File file = new File(filename);


            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                for (int i = 0; i < passwords.length; i++) {
                    passwords[i] = br.readLine();
                }


            } catch (FileNotFoundException e) {
                System.out.println("error: could not open file");
                //e.printStackTrace();
            } catch (IOException e) {
                System.out.println("error: could not read file");
                //e.printStackTrace();
            }


            for (String password : passwords) {
                System.out.println("*********\n" + password);
                boolean hasNumber = false;
                boolean hasLetter = false;
                boolean hasSpecialChar = false;
                boolean hasInvalidChar = false;

                for (int n = 0; n<password.length(); n++){
                    //condition 1: contain number
                    if("0123456789".contains(password.substring(n,n+1))){
                        hasNumber = true;
                        //System.out.println("position " + n + "contains a number");
                    }
                    //condition 2: contains letter
                    else if("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1).toLowerCase())){
                        hasLetter = true;
                        System.out.println("position " + n + "contains a letter");
                    }
                    //condition 3: contains special character
                    else if("!@#$%^&*()_+-?/|[]{}<>/?~`.,;:=".contains(password.substring(n,n+1))){
                        hasSpecialChar = true;
                        //System.out.println("position " + n + "contains a special character");
                    }
                    else{
                        //hasInvalidChar = true;
                        //System.out.println("position " + n + "contains a invalid character");
                        try {
                        throw new InvalidCharacterException(password.substring(n,n+1));
                        }catch (InvalidCharacterException e){
                            e.toString();
                            break;
                        }
                    }

                }

                //Test and exception handling
                /*if(hasInvalidChar){
                    //throw InvalidCharException
                    System.out.println("Invalid charater");
                }*/
                /*if(!hasLetter || !hasNumber || !hasSpecialChar){
                    //throw CriteriaError
                    System.out.println("Missing criteria");

                }*/
                //Test and exception handling
                    try {
                        if(!hasNumber){throw new NumberCriteriaException(password);}
                        else if(!hasLetter){throw new LetterCriteriaException(password);}
                        else if(!hasSpecialChar){throw new SpecialCharCriteriaException(password);}
                    } catch (NumberCriteriaException e) {
                        System.out.println(e.toString());
                    } catch (LetterCriteriaException e) {
                        System.out.println(e.toString());
                    } catch (SpecialCharCriteriaException e) {
                        System.out.println(e.toString());
                    }


            }


            //test against our criteria


    }
}


