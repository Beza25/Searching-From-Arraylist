import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int userNumber;
        String message = "", secondResponse;

        for(int i = 0; i < 10; i++){
            numbers.add(i, 1+ randomNumber.nextInt(50));
        }
        System.out.println("ArrayList: " + numbers);
        do{
            System.out.println("Enter a number?");
            userNumber = input.nextInt();
            input.nextLine();
            System.out.println("Value to find: " + userNumber + "\n");

            for(int number: numbers){
                if(number == userNumber){
                    message = userNumber + " is in the ArrayList.";
                    break;
                }else{
                    message = userNumber + " is not in the ArrayList.";
                }
            }
            System.out.println(message);
            System.out.println("Do you want to try again? Enter ('Y'/'N')");
            secondResponse = input.nextLine();
        }while(secondResponse.equalsIgnoreCase("y"));
    }
}
