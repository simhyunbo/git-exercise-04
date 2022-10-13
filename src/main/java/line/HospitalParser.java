package line;

public class HospitalParser implements Parser<Hospital>{

    private String replaceAllQuot(String str){

        return str.replace("\"","");
    }
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        String[] splitAddress = splitted[1].split(" ");
        String address = splitAddress[1]+" "+splitAddress[2];
        //return new Hospital(splitted[0]+splitted[1].replace("\'","\\\'")+address+splitted[2]+splitted[6]+splitted[10]);
        return  new Hospital(replaceAllQuot(splitted[0]),replaceAllQuot(splitted[1]));
    }
}
