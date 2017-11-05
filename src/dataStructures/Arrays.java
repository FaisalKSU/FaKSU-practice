package dataStructures;

public class Arrays {

    public static void main(String[] args){

        String[] alphabet = {"a","b","c","d","e","f"};
        for(int i = 0; i < alphabet.length; i++){

            System.out.println(alphabet[i]);

        }

//        for(String letter : alphabet){
//
//        }

        String[][] users = {{"john", "williams","jw@testmail.com","768768768"},
                             {"sarah","jackson","sj@testmail.com","786876868"},
                             {"rachel","wallace","rw@testmail.com","678687679"}
                            };

        //get the size of array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        System.out.println("Number of users: " + numOfUsers);
        System.out.println("Number of field " + numOfFields);

        //Traverse the double array

        for(int i = 0; i < numOfUsers; i++){

            String firstName = users[i][0];
            String lastName = users[i][1];
            String email = users[i][2];
            String phoneNum = users[i][3];

            System.out.println(firstName + lastName + email + phoneNum);

        }

        for(int i = 0; i < numOfUsers; i++){

           for(int j = 0; j < numOfFields; j++){
               System.out.println(users[i][j]);
           }

        }


        // using for-each
        for(String[] user : users){
            System.out.print("[ ");
            for(String field : user){
                System.out.print(field + " ");
            }
            System.out.println(" ]");

        }



    }



}
