package Builder;

public class Konfiguracja {
    static TextConverter getConverter(String name){
        switch (name){
            case "RemoveTag_ContentToUpperCase":
                return new RemoveTag_ContentToUpperCaseConverter();
            case "TagContentToUpperCase":
                return new TagContentToUpperCaseConverter();
            case "TagContentWithHashInBraces":
                return new TagContentWithHashInBracesConverter();
            default:
                return new PlainASCIIConverter();
        }
    }
}
