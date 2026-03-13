public class ReverseAnArrayInGroupGivenSize {

    public static void main(String[] str){
        int[] arr1= {1, 2, 3, 4, 5, 6, 7, 8};
        int k =3;
        ReverseAnArrayInGroupGivenSize(arr1,k );
        for (int num : arr1) {
            System.out.print(num + " ");
        }

    }

    private static void ReverseAnArrayInGroupGivenSize(int[] arr, int k){

        int n = arr.length;

        for(int i =0 ; i<n ; i+=k){

            int left =i ;
            int right = Math.min(i+k-1,n-1);

          while(left< right){
              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;
              left++;
              right--;
          }

        }

    }
}
