public abstract class BeverageMaker {
    public final void makeBeverage() {
        boilWater();
        pourInCup();
        brew();
        addCondiments();
    }
    void boilWater() {
        System.out.println("Water is boiled");
    }
    void pourInCup() {
        System.out.println("Pour in Cup");
    }
    abstract void brew();
    abstract void addCondiments();
}
