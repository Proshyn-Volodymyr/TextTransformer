public class UpDownTransformer extends TextTransformer{
    @Override
    public String transform(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(i % 2 != 0){
                Character ch = new Character(charArray[i]);
                ch.toString().toUpperCase();
            } else if (i % 2 == 0) {
                Character ch = new Character(charArray[i]);
                ch.toString().toLowerCase();
            }
        }
        return charArray.toString();
    }
}
