package Examples.basic.Sorting.HeapSort;

public class Main {
    public static void main(String[] args) {
        hw3();
    }

    static void hw3(){
        HeapSort hs = new HeapSort();
        int[] arr = {5, 8, 12, 3, 6, 9, 13};
        hs.buildTree(arr);
        hs.heapSort(arr);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
