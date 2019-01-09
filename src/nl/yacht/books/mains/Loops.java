package nl.yacht.books.mains;

public class Loops {

    public static void main(String[] args) {

        int a = 0;

        //basic for
        for(int i = 0;i<10;i++) {
            System.out.println(i);
        }

        george:

        a++;



        int[] numbers = {0,1,1,2,3,5,8,13,21,34,55,89};

        // enhanced for
        outer:
        for(int element: numbers) {
            System.out.println(element);
            for(int i = 0;i<element;i++) {
                if(element == 13) {
                    numbers[8]= 155;
                    continue outer;
                }
                System.out.println(i * i);
            }
        }

        // doing something 0 or more times

        int c = 55;
        while(c <70) {
            c++;
            if(c == 65 ){
                return;
            }
            System.out.println(c);

        }

        c = 100;

        // do 1 or more times

        do {
            System.out.println(c);
        }
        while(c < 13);


    }
}
