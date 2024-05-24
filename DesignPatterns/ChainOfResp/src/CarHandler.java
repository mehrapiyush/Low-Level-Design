public class CarHandler extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("Car")) {
            System.out.println("Its a car");
        } else {
            this.handler.handleRequest(request);
        }
    }
}
