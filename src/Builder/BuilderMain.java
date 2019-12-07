package Builder;

public class BuilderMain {
    public static void main(String[] args){
        String POWAŻNYHTML = "A<b>l</b>a ma <i>k</i>o<u>t</u>a i <długiTag>długaZawartosc</długiTag>";
        RTFReader rtfReader = new RTFReader();
        rtfReader.setBulider(Konfiguracja.getConverter("PlainASCII"));
        rtfReader.parseRTF(POWAŻNYHTML);
        System.out.println(rtfReader.getText());

        rtfReader.setBulider(Konfiguracja.getConverter("RemoveTag_ContentToUpperCase"));
        rtfReader.parseRTF(POWAŻNYHTML);
        System.out.println(rtfReader.getText());

        rtfReader.setBulider(Konfiguracja.getConverter("TagContentToUpperCase"));
        rtfReader.parseRTF(POWAŻNYHTML);
        System.out.println(rtfReader.getText());

        rtfReader.setBulider(Konfiguracja.getConverter("TagContentWithHashInBraces"));
        rtfReader.parseRTF(POWAŻNYHTML);
        System.out.println(rtfReader.getText());

    }
}
