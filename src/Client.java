import Modelos.BaseHandler;
import Modelos.Handler10000;
import Modelos.Handler100000;
import Modelos.Handler20000;
import Modelos.Handler5000;
import Modelos.Handler50000;

public class Client {
    private BaseHandler handler;
    
    public Client(){
        BaseHandler handler5000 = new Handler5000();
        BaseHandler handler10000 = new Handler10000();
        BaseHandler handler20000 = new Handler20000();
        BaseHandler handler50000 = new Handler50000();
        handler = new Handler100000();

        handler.selectNext(handler50000);
        handler50000.selectNext(handler20000);
        handler20000.selectNext(handler10000);
        handler10000.selectNext(handler5000);
    }

    public void goNext(int request){
        if (request % 5000 != 0){
            System.out.println("Error: la cantidad no es multiplo de $5000");
        } else {
            handler.handle(request);
        }
    }
}
