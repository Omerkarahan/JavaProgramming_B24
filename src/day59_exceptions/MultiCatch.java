package day59_exceptions;

public class MultiCatch {
    public static void main(String[] args) {

        try {

            Thread.sleep(-10);

            System.out.println(10/10);
        }catch (ArithmeticException e){
            System.out.println("Handled in Arithmetic block");
        } catch (RuntimeException e){
            System.out.println("Handled in runtime block");
        }catch (Exception e) {
            System.out.println("Handled generally");
        }
        /*

        possible polymorphic references for an exception, that is why you can catch with multiple catches
        ArithmeticException obj = new ArithmeticException();

        RunTimeException obj = new ArithmeticException();

        Exception obj = new ArithmeticException();
         */
    }
}
