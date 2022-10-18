package algori;

public class RectangleStar {
    void printRectangle(int x, int y){

        String star = "*";
        for(int i = 0;i<y;i++){
            System.out.println(star.repeat(x));
        }
    }
    public static void main(String[] args) {
        RectangleStar rectangleStar = new RectangleStar();
        rectangleStar.printRectangle(3,5);
    }
}
