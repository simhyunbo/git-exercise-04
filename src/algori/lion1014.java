package algori;

public class lion1014 {
    public int[] insertion(int[] insertionSortArr){
        int result = 0;
        for(int i =1 ;i<insertionSortArr.length;i++){
            int mainNum = insertionSortArr[i];
            for(int j=0;j<i+1;j++)
                if(mainNum<insertionSortArr[j]){
                    result = insertionSortArr[i];
                    insertionSortArr[i] = insertionSortArr[j];
                    insertionSortArr[j] = result;
                }

        }
        return insertionSortArr;

    }


    public static void main(String[] args) {
        lion1014 lion = new lion1014();
        int[] insertionSortArr = {8,5,6,2,4};

        int[] result = lion.insertion(insertionSortArr);
        for(int i = 0 ;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
