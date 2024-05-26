public abstract class Pizza {

    // Notes
    // Only One dimension as for all sub classes we will have some common featured for prep
    // Will use Restaurant class as bridge
    // Refer this video: https://www.youtube.com/watch?v=88kAIisOiYs&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=18
    protected String toppings;
    protected String sauce;
    protected String bread;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();
}
