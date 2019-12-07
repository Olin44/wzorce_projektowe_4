package Builder;

import java.util.regex.Matcher;

public class PlainASCIIConverter implements TextConverter{
    StringBuilder finalString = new StringBuilder();

    @Override
    public String getConvertedText() {
        return finalString.toString();
    }

    @Override
    public void convertCharacter(char c) {
        finalString.append(c);
    }

    @Override
    public void convertTag(Matcher tag) {
        finalString.append(tag.group(0));
    }


}
