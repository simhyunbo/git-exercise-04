package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        //디렉토리 접근하는법
        //현재 디렉토리 파일 목록 보기
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files){
            System.out.println(file);
        }
    }
}
