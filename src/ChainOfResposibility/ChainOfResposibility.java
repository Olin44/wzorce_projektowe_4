package ChainOfResposibility;
public class ChainOfResposibility {
    public static void main(String[] args){
        anApplication Application = new anApplication();
        aPrintButton PrintButton = new aPrintButton();
        aPrintDialog PrintDialog = new aPrintDialog();
        anOkButton OkButton = new anOkButton();
        aSaveDialog SaveDialog = new aSaveDialog();

        Konfiguracja.addNextLink(PrintButton, PrintDialog);
        Konfiguracja.addNextLink(PrintDialog, Application);
        Konfiguracja.addNextLink(OkButton, PrintDialog);
        Konfiguracja.addNextLink(SaveDialog, Application);

        PrintButton.HandleHelp(new Request("Pomoc"));
        PrintButton.HandleHelp(new Request("OkButtonRequest"));
        OkButton.HandleHelp(new Request("OkButtonRequest"));
    }

}
