//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Bridge Structural Pattern
        // Restaurant and Pizza are in 2 dimensions so Pizza acts as a bridge.
        VegRestaurant vegRestaurant = new VegRestaurant(new VeggiePizza());
        vegRestaurant.deliver();

        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant(new NonVegPizza());
        nonVegRestaurant.deliver();
    }
}