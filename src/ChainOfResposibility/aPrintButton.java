package ChainOfResposibility;

public class aPrintButton implements ChainLink {
    private ChainLink nextHandler;

    public void setNextHandler(ChainLink nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void HandleHelp(Request request) {
        if(request.getRequest().equals("ButtonRequest")){
            System.out.println("aPrintButton: Obsługuję rządanie: " + request.getRequest());
        }
        else{
            ShowHelp();
            nextHandler.HandleHelp(request);
        }
    }

    @Override
    public void ShowHelp() {
        System.out.println("aPrintButton: nie potrafię obsłużyć żądania i przekazuję je dalej");
    }

}