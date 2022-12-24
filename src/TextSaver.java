import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
    private TextTransformer transformer;
    private File file;

    public TextSaver(TextTransformer transformer, File file) {
        this.transformer = transformer;
        this.file = file;
    }

    public TextTransformer getTransformer() {
        return transformer;
    }

    public File getFile() {
        return file;
    }

    public void saveTextToFile(String text) {
        try (PrintWriter pw = new PrintWriter(file)) {
            String record = transformer.transform(text);
            pw.println(record);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
