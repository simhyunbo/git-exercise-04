package Day4_2;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public PopulationMove parse(String data){
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[1]);
    }
    /*public PopulationMove parse(String data){
        String[] dataArr = data.split(",");
        int fromSido = Integer.parseInt(dataArr[0]);
        int toSido = Integer.parseInt(dataArr[6]);
        PopulationMove move = new PopulationMove(toSido,fromSido);
        return move;
    }
    parse 변경전
     */
    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while((str = reader.readLine())!=null){
            PopulationMove pm = parse(str);
            pml.add(pm);

        }
        reader.close();
        return pml;
    }
    //파일 생성하기
    void createAFile(String filename) {
        File file =new File(filename);
        try {
            file.createNewFile();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    //파일에 저장하기
    public void wirte(List<String> strs,String filename){
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str : strs){
                writer.write(str);
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    //Map으로 cnt하기
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){

        Map<String,Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml){
            String key = pm.getFromSido() + ","+pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key,1);
            }
            moveCntMap.put(key,moveCntMap.get(key) +1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        PopulationStatistics populationStatistics = new PopulationStatistics();
        String address = "./from_to2.txt";
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        Map<String,Integer> map = populationStatistics.getMoveCntMap(pml);
        String targetFilename = "each_sido_cnt.txt";
        populationStatistics.createAFile(targetFilename);

        List<String> cntResult = new ArrayList<>();

        for(String key : map.keySet()){
            String s = String.format("key:%s value:%d\n",key,map.get(key));
            cntResult.add(s);
            //System.out.printf("key:%s value:%d\n",key,map.get(key));
        }
        populationStatistics.wirte(cntResult,targetFilename);



     /*   파일 작성하기
        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml){
            //System.out.printf("전입:%s, 전출:%d\n",pm.getFromSido(),pm.getToSido());
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }
        populationStatistics.wirte(strings,"./from_to2.txt");
        */
        //파일 생성하기
        //populationStatistics.createAFile("./from_to2.txt");
        
        //List<String> strings = new ArrayList<>();
        //        strings.add("11,11");
        //populationStatistics.wirte(strings,"./from_to2.txt"); 파일에 값 넣기
    }
}
