package Builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HTMLReader {
    private TextConverter bulider;

    public void setBulider(TextConverter bulider) {
        this.bulider = bulider;
    }

    public String getText(){
        return this.bulider.getConvertedText();
    };

    public void parseRTF(String text){
        int position = 0;
        while(position < text.length()){
            char element = text.charAt(position);
            if(element != '<'){
                bulider.convertCharacter(element);
                position++;
            }
            else{
                Pattern pattern = Pattern.compile("<(.+?)>(.+?)</\\1>");
                Matcher matcher = pattern.matcher(text.substring(position));
                if (matcher.find()) {
                    bulider.convertTag(matcher);
                    position += matcher.group(0).length();
                }

            }
        }
    }
}
