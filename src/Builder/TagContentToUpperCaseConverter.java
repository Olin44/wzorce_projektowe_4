package Builder;

import java.util.regex.Matcher;

public class TagContentToUpperCaseConverter implements TextConverter {
    StringBuilder finalString = new StringBuilder();

    @Override
    public String getConvertedText() {
        return finalString.toString();
    }

    @Override
    public void convertCharacter(char c) {
        String charAsString = String.valueOf(c);
        finalString.append(charAsString.toLowerCase());
    }

    @Override
    public void convertTag(Matcher tag) {
        String tagContentUpper = tag.group(2).toUpperCase();
        String tagName = tag.group(1);
        String convertedTag = "<" + tagName + ">"+ tagContentUpper + "</" + tagName + ">";
        finalString.append(convertedTag);
    }
}
