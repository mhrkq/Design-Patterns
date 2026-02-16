package src.com.minghui.designpatterns.creational.singleton;

public class MainApp {
    public static void main(String[] args) {
        
        System.out.println(Singleton.getInstance("Instance 1"));
        Singleton singleton = Singleton.getInstance("Instance 2");
        System.out.println(singleton);
        System.out.println(singleton.getData());
    }
}