package concepts.oca.buldingblocks;

/**
 * @author William
 * @version 1.0
 */
public class TypeofVariables {
    /* They are also called static variables
     * The scope is from outside the class if public without Class initialization
     * Are created as soon as the program is executed, and it is destroyed once execution ends
     * Initialization is not mandatory, if it is not explicitly initialized it will be initialized with default value
     */
    public static String classVariable = "Class variable";

    /* They are also called non-static variables
     * The scope is defined by the access modifier
     * Are created as soon as the program is executed, and it is destroyed once execution ends
     * Initialization is not mandatory, if it is not explicitly initialized it will be initialized with default value
     */
    public String instanceVariable; // The scope is from outside the class if public with Class initialization

    public TypeofVariables(){
        System.out.println("Class Variable value: " + classVariable); // initialized as null

        instanceVariable = "Instance variable";
        System.out.println("Instance Variable value: " +instanceVariable);
        showLocalVariables("Local variable #1");
    }

    public void showLocalVariables(String localVariable){ // Scope inside the method
        System.out.println("Local Variable value: " +localVariable);
        String localVariable2 = "Local variable #2"; // Scope inside the method, it must be initialized
        System.out.println("Local Variable #2 value: " +localVariable2);
        if(!localVariable.isEmpty()){
            String localVariable3 = "Local variable #3"; // Scope inside the block in which is defined, it must be initialized
            System.out.println("Local Variable #3 value: " +localVariable3);
        }
        // System.out.println(localVariable3); // Not allowed here
    }

}
