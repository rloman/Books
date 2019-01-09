package nl.yacht.books.mains;

public class ShowBlocksTrainer {

    static int size;

    public static void main(String[] args) {


        size = 33;
        int localSize = 100;


    }

    public static void foo() {
        int localSize = 45;

        {
            int foo = 45;
            {
                {

                }
            }
        }


        {
            int foo = 39;
        }
    }
}
