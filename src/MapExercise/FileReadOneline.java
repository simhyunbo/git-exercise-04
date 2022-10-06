package MapExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadOneline {

    public String FileLine(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = "";
        line = bufferedReader.readLine();
        return line;
        }




    public static void main(String[] args) throws IOException {
        //한개 라인 읽는 메소드
        FileReadOneline fileReadOneline = new FileReadOneline();
        String s = fileReadOneline.FileLine("./a_file");
        System.out.println(s);

    }
}
