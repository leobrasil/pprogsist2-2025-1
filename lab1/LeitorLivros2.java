import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorLivros2 {
    public static void main(String[] args) {
        try {
            String livros[] = LeitorLivros2.leLivros("lab1/livros.txt");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String[] leLivros(String path)throws Exception{
        Path arq_livros = Paths.get(path);
        String aux[] = Files.readAllLines(arq_livros).toArray(new String[0]);

        return aux;
    }
}
