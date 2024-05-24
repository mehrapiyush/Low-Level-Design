public class Tea extends BeverageMaker {
    @Override
    void brew() {
        System.out.println("Tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea add condiments");
    }
}
