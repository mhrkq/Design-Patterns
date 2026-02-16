package src.com.minghui.designpatterns.creational.abstractfactory.products;

public class ClassicBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Classic Burger...");
    }

}
