package singletonpattern;
public class TestSingleton {
    private TestSingleton(){

    }
    static private TestSingleton obj;
    public static TestSingleton getInstance() {
        if(obj == null){
            obj = new TestSingleton();
        }
        return obj;
    }
}
