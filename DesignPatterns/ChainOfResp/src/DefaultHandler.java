public class DefaultHandler extends  AbstractHandler{
    @Override
    public void handleRequest(String request) {
        System.out.println("No Request Matched");
    }
}
