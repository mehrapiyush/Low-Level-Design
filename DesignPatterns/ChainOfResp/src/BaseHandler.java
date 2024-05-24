public interface BaseHandler {
    void setNext(BaseHandler h);
    void handleRequest(String request);
}
