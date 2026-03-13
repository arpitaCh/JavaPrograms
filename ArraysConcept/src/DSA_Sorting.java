public class DSA_Sorting {

    public static void main(String[] str){

        int[] arr1 = { 2,8,4,-1,7,10,5,6};
        selectionSort(arr1);

        int[] arr2 = {4,6,8,9,-1,5,2};
        bubbleSort(arr2);

    }

    private static void bubbleSort(int[] arr2) {

        int n = arr2.length;
        for(int i=0; i<n-1;i++){
           for(int j=0; j< n-1-i;j++){
                if(arr2[j] > arr2[j+1]){
                    int temp= arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1]= temp;
                }
            }
        }

        System.out.println(" bubble sort: ");
        for(int val : arr2){

            System.out.print(val +" , ");
        }
        System.out.println();



    }

    private static void selectionSort(int[] arr1) {

        int n = arr1.length;

        for(int i=0; i< n-1;i++ ){
            int minIndex =i;
            int minValue = arr1[i];
           for(int j=i+1; j <n; j++){

               if(arr1[j]<minValue) {
                   minIndex = j;
                   minValue = arr1[j];
               }
           }
                     int temp= arr1[i];
                     arr1[i] = arr1[minIndex];
                     arr1[minIndex] = temp;

               }

        System.out.println("selection sort");
        for(int val : arr1){
            System.out.print(val +" , ");
           }
        System.out.println();



    }

    }

