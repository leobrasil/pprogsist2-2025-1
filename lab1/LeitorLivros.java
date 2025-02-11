import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorLivros{

    public static void main(String[] args) {
        Path arq_livros = Paths.get("lab1/livros.txt");
        System.out.println("iniciando processo de leitura");
        try{
            String livros[] = Files.readAllLines(arq_livros).toArray(new String[0]);
            for (String livro : livros) {
                System.out.println(livro);
            }
        }catch(IOException ioex1){
            //ioex1.printStackTrace();
            System.out.println("nao foi possivel ler o arquivo");
        }



    }
}