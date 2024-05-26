public class NonVegRestaurant extends Restaurant{
    public NonVegRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.sauce = "Chillie" + " Mayo"+" Pepporine";
    }

    @Override
    void addTopings() {
        pizza.toppings = "Veggies + Non Veg";
    }

    @Override
    void addBread() {
        pizza.bread = "Maida";
    }

    @Override
    void addCrust() {
        pizza.crust = "Normal";
    }
}
