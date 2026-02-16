package src.com.minghui.designpatterns.creational.factory.products;

public class ClassicBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Classic Burger...");
    }

}
