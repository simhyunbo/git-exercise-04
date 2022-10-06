package MapExercise;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead3 {
    
    public static void main(String[] args) throws IOException {
        // n글자씩 읽는 method
        FileReader reader = new FileReader("./a_file");

        Scanner sc = new Scanner(System.in);
        System.out.print("글자수 입력: ");
        int baseNum = sc.nextInt();

        for(int i=0;i<baseNum;i++){
            char ch = (char) reader.read();
            System.out.print(ch);
        }

        




    }
}
