package ChainOfResposibility;

public class aPrintDialog implements ChainLink {
    private ChainLink nextHandler;

    @Override
    public void HandleHelp(Request request) {
        if(request.getRequest().equals("DialogRequest")){
            System.out.println("aPrintDialog: Obsługuję żądanie: " + request.getRequest());
        }
        else{
            ShowHelp();
            nextHandler.HandleHelp(request);
        }
    }

    @Override
    public void ShowHelp() {
        System.out.println("aPrintDialog: nie potrafię obsłużyć żądania i przekazuję je dalej");
    }

    @Override
    public void setNextHandler(ChainLink nextLink) {
        this.nextHandler = nextLink;
    }
}