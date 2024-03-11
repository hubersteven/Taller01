package Modelos;

public abstract class BaseHandler implements Handler{
    
    private Handler next;

    public void selectNext(Handler next){
        this.next = next;
    }

    public void goNext(int request){
        if (next !=  null ){
            next.handle(request);
        }
    }
}

