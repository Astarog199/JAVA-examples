package Lessons.Sorting;
//    O(n log n)
public class MergeSort {
    public static void main(String[] args) {
        int [] arr = new int[]{5, 1, 6, 2, 3, 4};
        breaking(arr);
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] breaking(int[] a){
//        5, 1, 6, 2, 3, 4

        int length = a.length;
        if (length ==1) return a;

        int mid = length/2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i=0; i<mid; i++){
            left[i] = a[i];
        }

        for (int i=mid; i<length; i++){
            right[i-mid] = a[i];
        }

        left = breaking(left);
        right = breaking(right);
        return  merge(a, left, right);
    }

    private static int[]  merge( int[] a, int []left, int [] right){
        int l_leng = left.length;
        int r_leng = right.length;
        int i=0;
        int j=0;
        int idx = 0;

        while (i<l_leng && j<r_leng){
            if(left[i]<right[j]){
                a[idx]=left[i];
                i++;
                idx++;
            }else {
                a[idx] = right[j];
                j++;
                idx++;
            }
        }

        for (int index_l =i; index_l< l_leng; index_l++){
            a[idx++]=left[index_l];
        }

        for (int index_r =j; index_r< l_leng; index_r++){
            a[idx++]=right[index_r];
        }
        return a;
    }
}
