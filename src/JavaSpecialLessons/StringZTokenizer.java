package JavaSpecialLessons;

import java.util.StringTokenizer;

public class StringZTokenizer {

    // TODO: 4/20/2023 how to split tokenizing strings   // how to split tokenizing strings

    public static void main(String[] args) {


        String input = "John,Doe,30";

        StringTokenizer tokenizer = new StringTokenizer(input, ",");

       //TODO :  this constructor take a string and the seperated by ( , )
        //TODO : and the three seperated values is assigned to variables

        String firstName = tokenizer.nextToken();
        String lastName = tokenizer.nextToken();
        int age = Integer.parseInt(tokenizer.nextToken());

        System.out.printf("""
                your first name is %s \n
                your second name is %s \n
                your age is %d \n
                """,firstName,lastName, age);


        String str = "The quick brown fox";
        StringTokenizer st = new StringTokenizer(str, " ");

        // TODO the while loop is looping through if the hasMoreToken is null

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // TODO: 4/20/2023   //        StringTokenizer(String str, String delim): This constructor creates a 
// TODO: 4/20/2023    //        StringTokenizer object with the specified string and delimiter.
        // TODO: 4/20/2023   //
        // TODO: 4/20/2023   //        boolean hasMoreTokens(): This method checks if there are 
        // TODO: 4/20/2023       // TODO: 4/20/2023  //        more tokens available in the StringTokenizer.
//
        // TODO: 4/20/2023   //        String nextToken(): This method returns the next 
// TODO: 4/20/2023  //        token from the StringTokenizer.
//
// TODO: 4/20/2023  //        int countTokens(): This method returns 
//        the total number of tokens remaining in the StringTokenizer.
//
// TODO: 4/20/2023  //        String nextToken(String delim): This method returns
//        the next token based on the specified delimiter.
//
// TODO: 4/20/2023  //                Enumeration<String> tokens(): This method returns an 
//        enumeration of all the tokens in the StringTokenizer.


    }


}
