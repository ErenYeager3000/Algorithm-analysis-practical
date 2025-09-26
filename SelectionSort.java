import java.util.Scanner;

public class SelectionSort {

  static void selection_sort(int[] arr, int n) {
    int size = arr.length;
    int minIndex = -1;
    int temp = 0;

    for (int i = 0; i < size - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }

      }
      temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number how many elements you want to enter : ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the array elements : ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Before sorting the array : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }

    selection_sort(arr, n);
    System.out.println();

    System.out.println("After sorting the array : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
