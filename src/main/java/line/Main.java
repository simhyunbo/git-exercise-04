package line;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\USER\\Desktop\\서울시 병의원 위치 정보.txt";

        List<Hospital> hospitals = hospitalLineReader.readLines(filename);


        for(Hospital hospital : hospitals){
            System.out.println(hospital.getId());

        }
        System.out.println(hospitals.size());
    }
}
