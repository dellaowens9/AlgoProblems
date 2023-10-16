public class FizzBuzz {
    public static void main(String[] args){
        String result = "";
        for (int i = 1; i <= 15; i++){

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
