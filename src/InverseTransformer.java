public class InverseTransformer extends TextTransformer{
    @Override
    public String transform(String text) {
        StringBuilder input = new StringBuilder();
        input.append(text);
        input.reverse();
        return input.toString();
    }
}
