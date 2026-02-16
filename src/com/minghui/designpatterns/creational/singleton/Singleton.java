package src.com.minghui.designpatterns.creational.singleton;

// SINGLETON PATTERN

// ensures that only 1 instance of its kind exists
// provides a single point of access to it
// lets you access your object from anywhere in the application
// guarantees that only 1 instance of this class will be available at any point in time

// double-checked locking idiom
// limits synchronisation to the rare case of constructing a new instance
// skips synchronisation when retrieving an already-created instance

// a shared variable stored in the memory can reference a partially constructed object
// instance is not null even though the initialisation is not done yet
// e.g. while Singleton object is being constructed by thread A, thread B may try to retrieve it
// because of the first if statement, thread B will not wait for thread A to finish the initialisation 
// and use the instance referenced even if it is a partially constructed object, causing the application to crash
// to avoid this, set Singleton instance to 'volatile', 
// which ensures that multiple threads will be able to handle the Singleton instance correctly

// everytime we access this volatile variable (instance) we need to read it directly from the main memory
// as it cannot be cached
// store the instance in a local variable (result)
// to prevent retrieval of (instance) twice (first if check & return statement)
// improves method's overall performance

public class Singleton {

    private final String data;

    private static volatile Singleton instance;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) { // double-checked locking idiom
            synchronized (Singleton.class) { // synchronized = only 1 thread can execute this code block at a given time
                result = instance;
                if (result == null) { // check if an instance was created, if not created, create a new instance
                    instance = result = new Singleton(data);
                }
            }
        }
        return result; // else return the old instance
    }

    public String getData() {
        return data;
    }

}
