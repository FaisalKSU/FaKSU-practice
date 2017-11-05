package CSCI;
import java.io.*;
public class PasswordDrive {

    public static void main(String[] args){
        String fileName = "/Users/faisalabdulkadir/Desktop/Java Project/JavaTraining/src/CSCI/ThePasswords.txt";
        String[] passwords = new String[4];
        File file =  new File(fileName);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            for(int i = 0; i < passwords.length; i++){

                passwords[i] = br.readLine();
                //System.out.println(passwords[i]);
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Error: File not found");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error: could not read the file");
        }

        for (String password : passwords) {
            System.out.println("________________________________________________________________\n" + "The Password is: " + password);
            boolean hasNumber = false;
            boolean hasUpLetter = false;
            boolean hasLength = false;
            for (int n = 0; n < password.length(); n++){
                if (password.length() == 10) {
                    hasLength = true;
                    //System.out.println("Password is 10 character long");}
                }
                if(Character.isUpperCase(password.charAt(n))){

                    hasUpLetter = true;
                    //System.out.println("position " + n + " contains a upper letter. This is the characters it catches " + password.charAt(n));
                }
                if("0123456789".contains(password.substring(n,n+1))){
                    hasNumber=true;
                    //System.out.println("position " + n + " contains a number. This is the characters it catches " + password.charAt(n));
                }
            }
            try {
                if(!hasNumber){throw new DigitCriteriaException(password);}
                else if(!hasUpLetter){throw new UpLetterCriteriaException(password);}
                else if(!hasLength){throw new LengthCriteriaException(password);}
                else{
                    System.out.println("That password meets all the criteria and is valid.");
                }
            } catch (DigitCriteriaException e) {
                System.out.println(e.toString());
            } catch (UpLetterCriteriaException e) {
                System.out.println(e.toString());
            } catch (LengthCriteriaException e) {
                System.out.println(e.toString());
            }
        }
    }
}
