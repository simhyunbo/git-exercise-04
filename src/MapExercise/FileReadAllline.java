package MapExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadAllline {

    public String FileLine(String filename,int num) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = "";
        String str = "";
        for(int i =0;i<num;i++){
           str += line = bufferedReader.readLine()+" ";
        }
            return str;
        }




    public static void main(String[] args) throws IOException {
        //모든 라인 읽는 메소드
        FileReadAllline fileReadallline = new FileReadAllline();


        String s = fileReadallline.FileLine("./a_file",2);
        System.out.println(s);

    }
}
