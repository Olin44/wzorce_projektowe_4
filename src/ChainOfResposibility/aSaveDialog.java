package ChainOfResposibility;

public class aSaveDialog implements ChainLink {
    private ChainLink nextHandler;

    public void setNextHandler(ChainLink nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void HandleHelp(Request request) {
        if(request.getRequest().equals("SaveDialogRequest")){
            System.out.println("aSaveDialog: Obsługuję rządanie: " + request.getRequest());
        }
        else{
            ShowHelp();
            nextHandler.HandleHelp(request);
        }
    }

    @Override
    public void ShowHelp() {
        System.out.println("aSaveDialog: nie potrafię obsłużyć żądania i przekazuję je dalej");
    }

}