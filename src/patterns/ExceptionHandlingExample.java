package patterns;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = { 1, 2, 3 };
            int index = 4;
            int result = numbers[index];
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Exception handling code for ArrayIndexOutOfBoundsException
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            // Code that is always executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
        }
        
        // Code continues to execute after the exception handling
        System.out.println("Program continues after exception handling.");
    }
}
