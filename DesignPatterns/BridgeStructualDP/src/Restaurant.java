public abstract class Restaurant {
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }
    abstract void addSauce();
    abstract void addTopings();
    abstract void addBread();
    abstract void addCrust();

    public void deliver() {
        addBread();
        addSauce();
        addTopings();
        addCrust();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress");
        System.out.println("Order Completed \n");
    }


}
