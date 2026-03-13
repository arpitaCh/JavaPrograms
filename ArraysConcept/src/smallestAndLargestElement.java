public class smallestAndLargestElement {

    public static void main(String[] str){

        int[] arr1 ={ 7,4,5,6,3};

        int max = arr1[0];

        for(int i =0 ; i< arr1.length;i++){

            if(arr1[i]> max ){
                max = arr1[i];

            }
        }

      int secondMax = arr1[1];
        for( int i = 0 ; i< arr1.length; i++){
            if((arr1[i] > secondMax) &&  (arr1[i] < max)){
                secondMax = arr1[i];
            }
        }

        System.out.println(" second max element is "+ secondMax);


        int min = Integer.MAX_VALUE;

        int secondMin = Integer.MAX_VALUE;

        for(int num :arr1){

            if(num<min){
//                secondMin= min;
                min= num;

            }
            else if( num < secondMin && num != min){
                secondMin = num;
            }
        }

        System.out.println("Second smallest element is: " + secondMin +"min val is"+ min);



    }
}
