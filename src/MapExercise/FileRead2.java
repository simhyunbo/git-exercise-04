package MapExercise;


import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
    
    public static void main(String[] args) throws IOException {
        // 한 byte씩 읽는 method
        FileReader reader = new FileReader("./a_file");


        for(int i=0;i<2;i++){
            char ch = (char) reader.read();
            System.out.print(ch);
        }

        




    }
}
