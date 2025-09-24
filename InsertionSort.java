import java.util.Scanner;

public class InsertionSort {

  static void insertion_sort(int[] arr, int n) {

    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number how many elements you want to enter : ");
    int n = sc.nextInt();

    System.out.println("Enter the array elements : ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Before sorting the array elements : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
    insertion_sort(arr, n);
    System.out.println("After sorting the array elements : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }

    sc.close();
  }

}
