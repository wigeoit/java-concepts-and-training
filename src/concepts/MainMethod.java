package concepts;

/**
 * @author William
 * @version 1.0
 */
public class MainMethod {
    /*
     * public declares that the method can be accessed from outside the class
     * static declares that the method can be accessed without an instance of the class
     * void declares the return type of the method, void does not return any value
     * main declares the name of the method, the JVM will try to find this exact name to be executed
     * String[] declares the type of the argument variable, in this case an array of String
     * args declares the name of the argument variable, it can be any name.
     */

    /**
     * @param args
     */
    public static void main(String[] args){
        /*
         The main method is the first piece of our code that is executed
          by the JVM, and it will be located at the stack
        */
        System.out.println(Character.MIN_VALUE);
    }
}
