package algori;

public class lion1013 {
    public int[] bubble(int[] bubbleSortArr){
        int result = 0;
        for(int i =0 ;i<bubbleSortArr.length-1;i++){
            for(int j=i+1;j<bubbleSortArr.length;j++)
                if(bubbleSortArr[i]>bubbleSortArr[j]){
                    result = bubbleSortArr[i];
                    bubbleSortArr[i] = bubbleSortArr[j];
                    bubbleSortArr[j] = result;
                }

        }
        return bubbleSortArr;

    }


    public static void main(String[] args) {
        lion1013 lion = new lion1013();
        int[] bubbleSortArr = {7,2,3,9,28,11};

        int[] result = lion.bubble(bubbleSortArr);
        for(int i = 0 ;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
