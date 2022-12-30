package concepts.ocp.designpatterns;

//Since all the constructor are marked as private, the singleton class is effectively final
public class SingletonClass {

    //A singleton class must have private attributes
    private String message;

    //A singleton class must have a private non-args default constructor
    private SingletonClass(){

    }

    //A singleton class must have a private static final instance variable of the class reference
    //this variable will contain the object instance created in the constructor
    private static final SingletonClass instance = new SingletonClass();

    /*
     * It is very common to see also the lazy instantiation on a singleton class
     * the lazy instantiation is not-thread safe, for that it must be synchronized
     * ,but it has some advantages over the other type of instantiation
     * is that it reduces memory usage and improves performance when an application starts up

    public static synchronized SingletonClass getLazyInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
    */

    //A singleton class must have a public static method (usually named getInstance) that returns the instance
    public static SingletonClass getInstance(){
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
