import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TextTransformer tt = new TextTransformer();
        InverseTransformer it = new InverseTransformer();
        UpDownTransformer ud = new UpDownTransformer();
        File fileOne = new File("textTransform.txt");
        TextSaver textSaver1 = new TextSaver(tt, fileOne);
        TextSaver textSaver2 = new TextSaver(it, fileOne);
        TextSaver textSaver3 = new TextSaver(ud, fileOne);
        try{
            fileOne.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
        textSaver1.saveTextToFile("Glory to Ukraine");
//        textSaver2.saveTextToFile("Glory to Ukraine");
//        textSaver3.saveTextToFile("Glory to Ukraine");

    }
}