package src.com.minghui.designpatterns.creational.builder;

// defines the order in which we should call the construction steps
// so that we can reuse specific configurations of the products we are building
// hides the details of the product construction from the client code

// directors are optional

import src.com.minghui.designpatterns.creational.builder.model.Builder;

public class Director {
    public void buildBugatti(Builder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .height(120);
    }
}
