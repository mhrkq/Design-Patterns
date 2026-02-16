package src.com.minghui.designpatterns.creational.abstractfactory.products;

public class ClassicPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Classic Pizza...");
    }

}
