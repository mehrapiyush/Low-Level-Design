import java.util.Objects;

public class BusHandler extends AbstractHandler {

    @Override
    public void handleRequest(String request) {
        if(Objects.equals(request, "BUS")) {
            System.out.println("Its a bus");
        } else {
            this.handler.handleRequest(request);
        }
    }
}
