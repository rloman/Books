package nl.yacht.books.mains;

import java.util.ArrayList;

public class ArrayTrainer {

    public static void main(String[] args) {


        // simple
        {
            int[] numbers = new int[]{0,1,1,2,3,5,8,13,21};

            if(numbers instanceof Object) {
                System.out.println("Yes, numbers is an object");
            }
        }

        {
            int[] numbers = {0,1,2,3,5}; // same net result
        }

        {
            int[] numbers = new int[]{1,2,3};
        }

        {
            String[] names = new String[]{"Roy", "Fielding"};
        }



    }


}
