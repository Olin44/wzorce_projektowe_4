package Builder;

import java.util.regex.Matcher;

public class RemoveTag_ContentToUpperCaseConverter implements TextConverter{
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
            String tagContent = tag.group(2);
            finalString.append(tagContent.toUpperCase());
        }
}
