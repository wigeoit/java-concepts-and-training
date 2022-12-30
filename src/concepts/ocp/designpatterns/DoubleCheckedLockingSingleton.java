package concepts.ocp.designpatterns;

public class DoubleCheckedLockingSingleton {

    //A singleton class must have private attributes
    private String message;

    //A singleton class must have a private non-args default constructor
    private DoubleCheckedLockingSingleton(){

    }

    //A singleton class must have a private static final instance variable of the class reference
    //this variable will contain the object instance created in the constructor
    private static volatile DoubleCheckedLockingSingleton instance;

    /*
     * Tests if synchronization is needed before actually cquiring any locks

     */

    public static synchronized DoubleCheckedLockingSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    //All public methods that use the singleton object variables must be synchronized
    public synchronized void setMessage(String message){
        this.message = message;
    }

    public synchronized String getMessage(){
        return this.message;
    }
}
