public class Coffee extends BeverageMaker{
    @Override
    protected void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee add condiments");
    }
}
