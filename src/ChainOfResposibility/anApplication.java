package ChainOfResposibility;

public class anApplication implements ChainLink{

    @Override
    public void HandleHelp(Request request) {
        if(request.getRequest().equals("Pomoc")){
            ShowHelp();
        }
        else{
            System.out.println("anApplication: Ostatnie ogniwo łańcucha, nie potrafię obsłużyć żądania: " + request.getRequest() + "\n");
        }
    }

    @Override
    public void ShowHelp() {
        System.out.println("anApplication: potrafię obsłużyć żądanie, wyświetlam pomoc\n");   }

    @Override
    public void setNextHandler(ChainLink nextLink) {

    }
}
