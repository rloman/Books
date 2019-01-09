package nl.yacht.books.solutions;

public class ArraySquareTrainer {

    public static void main(String[] args) {

        int[] in = new int[]{1,2,3,4,5,6};

        int[] out =  new int[in.length];

        for(int i = 0;i<in.length;i++) {

            out[i] = (int) Math.pow(in[i], 2); // fastest lane

            out[i] = Double.valueOf(Math.pow(i, 2)).intValue(); // cleanest lane // works but it is a little expensive(r) and is clean(er) than ... =>

            out[i] = (int) Math.round(Math.pow(i,2)); // chips, returns a long and have to cast again

        }

        for(int element: out) {
            System.out.println(element);
        }


    }
}
