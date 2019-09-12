import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //output("Generate 10 random integers between 1 and 6");



        Random numbers = new Random();

        for(int i=1; i < 11; i++) {

            int number = 1 + numbers.nextInt(6);


//        System.out.println("Generate 10 random integers between 0 and 6");

            System.out.println("My random number is " + number);

        }

        /*System.out.println("Here are some numbers from 1 to 6!");

        {

        }}
            System.out.println();

            int randomInt = 1 + numbers.nextInt(i);
            System.out.println("Great answer: " + randomInt);
            System.out.println("Done");*/
        }


    }
