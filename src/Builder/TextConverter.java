package Builder;

import java.util.regex.Matcher;

interface TextConverter {
    void convertCharacter(char c);
    void convertTag(Matcher tag);
    String getConvertedText();

}
