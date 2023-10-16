import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        String result = "";
        int userInput;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = console.nextInt();

        for (int i = 1; i <= userInput; i++){

            if (i % 5 == 0 && i % 3 == 0){
                result += " FizzBuzz";
            }
            else if ( i % 3 == 0){
                result += " Fizz";
            }
            else if ( i % 5 == 0){
                result += " Buzz";
            }
            else{
                result += " " + Integer.toString(i);
            }
        }

        System.out.println((result));
    }
}
