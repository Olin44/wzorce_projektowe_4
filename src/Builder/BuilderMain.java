package Builder;

public class BuilderMain {
    public static void main(String[] args){
        String POWAŻNYHTML = "A<b>l</b>a ma <i>k</i>o<u>t</u>a i <długiTag>długaZawartosc</długiTag>";
        HTMLReader HTMLReader = new HTMLReader();
        HTMLReader.setBulider(Konfiguracja.getConverter("PlainASCII"));
        HTMLReader.parseRTF(POWAŻNYHTML);
        System.out.println(HTMLReader.getText());

        HTMLReader.setBulider(Konfiguracja.getConverter("RemoveTag_ContentToUpperCase"));
        HTMLReader.parseRTF(POWAŻNYHTML);
        System.out.println(HTMLReader.getText());

        HTMLReader.setBulider(Konfiguracja.getConverter("TagContentToUpperCase"));
        HTMLReader.parseRTF(POWAŻNYHTML);
        System.out.println(HTMLReader.getText());

        HTMLReader.setBulider(Konfiguracja.getConverter("TagContentWithHashInBraces"));
        HTMLReader.parseRTF(POWAŻNYHTML);
        System.out.println(HTMLReader.getText());

    }
}
