public class VegRestaurant extends Restaurant{
    public VegRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.sauce = "Chillie" + " Mayo";
    }

    @Override
    void addTopings() {
        pizza.toppings = "Veggies only";
    }

    @Override
    void addBread() {
        pizza.bread = "Wheat";
    }

    @Override
    void addCrust() {
        pizza.crust = "thin";
    }
}
