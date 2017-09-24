package test.narci.j8;

public class ExceptionGenerator {
    public void checkOddNumber (int number){
        if (number %2==0){
            throw new IllegalArgumentException ( "not an odd number" );
        }

    }

    public static void main ( String[] args ) {
        ExceptionGenerator exceptionGenerator= new ExceptionGenerator ();
        exceptionGenerator.checkOddNumber ( 20 );
    }
}
