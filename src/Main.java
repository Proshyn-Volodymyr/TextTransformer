public class Main {
    public static void main(String[] args) {
     TextTransformer tt = new TextTransformer();
     InverseTransformer it = new InverseTransformer();
     UpDownTransformer ud = new UpDownTransformer();
        System.out.println(tt.transform("Hello world"));
        System.out.println(it.transform("Hello world"));
        System.out.println(ud.transform("Hello world"));
    }
}