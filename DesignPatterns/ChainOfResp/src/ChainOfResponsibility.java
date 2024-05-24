public class ChainOfResponsibility {
    public BaseHandler assignChain() {
        BaseHandler busHandler = new BusHandler();
        BaseHandler carHandler = new CarHandler();
        BaseHandler defaultHandler = new DefaultHandler();
        busHandler.setNext(carHandler);
        carHandler.setNext(defaultHandler);
        return busHandler;
    }
}
