package algori;

public class lion1013 {
    public int[] bubble(int[] bubbleSort){
        int result = 0;
        for(int i =1 ;i<bubbleSort.length;i++){

                if(bubbleSort[0]>bubbleSort[i]){
                    result = bubbleSort[i];
                    bubbleSort[0] = bubbleSort[i];
                    bubbleSort[i] = result;
                }

        }
        return bubbleSort;

    }


    public static void main(String[] args) {
        lion1013 lion = new lion1013();
        int[] bubbleSort = {7,2,3,9,28,11};

        int[] result = lion.bubble(bubbleSort);
        for(int i = 0 ;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
