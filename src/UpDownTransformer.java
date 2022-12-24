import java.util.Arrays;

public class UpDownTransformer extends TextTransformer{
    @Override
    public String transform(String text) {
       StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if(i % 2 != 0){
                char upChar = Character.toUpperCase(ch);
                str.append(upChar);
            } else if (i % 2 == 0) {
                char lowChar = Character.toLowerCase(ch);
                str.append(lowChar);
            }
        }
        return str.toString();
    }
}
