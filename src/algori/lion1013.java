package algori;

public class lion1013 {
    public static void main(String[] args) {

        int[] bubbleSort = {7,2,3,9,28,11};
        int result = 0;
        for(int i = 0 ;i<bubbleSort.length;i++){
            for(int j = 1;j<bubbleSort.length;j++){
                if(bubbleSort[i]>bubbleSort[j]){
                    result = bubbleSort[i];
                    bubbleSort[i] = bubbleSort[j];
                    bubbleSort[j] = result;
                }
            }
        }
        System.out.println(bubbleSort[0]);
    }
}
