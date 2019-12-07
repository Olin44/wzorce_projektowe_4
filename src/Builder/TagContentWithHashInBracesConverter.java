package Builder;

import java.util.regex.Matcher;

public class TagContentWithHashInBracesConverter implements TextConverter {
    StringBuilder finalString = new StringBuilder();

    @Override
    public void convertCharacter(char c) {
        finalString.append(c);
    }

    @Override
    public void convertTag(Matcher tag) {
        String tagContent = tag.group(2);
        String tagName = tag.group(1);
        String convertedTag = "{" + tagName + "#" + tagContent + "}";
        finalString.append(convertedTag);
    }

    @Override
    public String getConvertedText() {
        return finalString.toString();
    }
}
