package MapExercise;


import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    
    public static void main(String[] args) throws IOException {
        // 한 byte씩 읽는 method
        FileReader reader = new FileReader("./a_file");

        char ch = (char) reader.read();
        System.out.println(ch);


    }
}
