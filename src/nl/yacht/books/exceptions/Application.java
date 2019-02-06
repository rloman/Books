package nl.yacht.books.exceptions;

public class Application {

    public static void main(String[] args)  /* throws Exception declare */ {

        int a = 3;
        int b = 4;

        // try catch programming is in fact the (bad) GOTO programming
        try {
            int resultOfDividing = demoCheckedExceptionDividing(a,b);
        }
        /*
        catch(YachtCannotDivideByZeroException | YachtRuntimeException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You cannot divide by zero, friend!");
        }
        */
        catch(YachtCannotDivideByZeroException  e) {
            System.out.println("You cannot divide by zero, friend!");
        }

        catch(YachtRuntimeException yte) {
            System.out.println("Caught the YachtRuntimeException");
        }
        catch(NullPointerException npe) {
            //
        }
        catch(ArrayIndexOutOfBoundsException aiobe) {
            //
        }
        finally {
            // close some db or stream ...
        }
    }

    public static int demoCheckedExceptionDividing(int a, int b) throws YachtCannotDivideByZeroException {

        if(b == 0) {
            throw new YachtCannotDivideByZeroException();
        }
        if(b == -1) {
            throw new YachtRuntimeException();
        }

        String s = null;
        System.out.println(s.toLowerCase());

        return a/b;

    }

    public static void demoRuntimeException() {

        int a = 4;
        int b = 0;

        try {
            System.out.println(a/b);
            // when it completes it jumps AFTER the catch block
        }
        catch(ArithmeticException e){
            System.out.println("Sorry, that went terribly wrong!");
            // continue here ...
        }
        catch(Exception e){

        }
        // here

    }
}
