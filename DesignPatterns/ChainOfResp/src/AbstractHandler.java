
public abstract class AbstractHandler implements BaseHandler {
    protected BaseHandler handler = null;

    @Override
    public void setNext(BaseHandler h) {
        this.handler = h;
    }
}
