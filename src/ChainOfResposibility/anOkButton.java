package ChainOfResposibility;

public class anOkButton implements ChainLink {
    private ChainLink nextHandler;

    @Override
    public void HandleHelp(Request request) {
        if(request.getRequest().equals("OkButtonRequest")){
            System.out.println("anOkButton: Obsługuję żądanie: " + request.getRequest());
        }
        else{
            ShowHelp();
            nextHandler.HandleHelp(request);
        }
    }

    @Override
    public void ShowHelp() {
        System.out.println("anOkButton: nie potrafię obsłużyć żądania i przekazuję je dalej");
    }

    @Override
    public void setNextHandler(ChainLink nextLink) {
        this.nextHandler = nextLink;
    }
}
