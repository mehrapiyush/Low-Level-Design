public class VeggiePizza extends Pizza {
    @Override
    public void assemble() {
        System.out.println("Adding Sauce" + this.sauce);
        System.out.println("Adding Toppings" + this.toppings);
        System.out.println("Adding Crust" + this.bread);
        // Differentiator
        System.out.println("Adding Veg");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is" + this.crust);
    }
}
