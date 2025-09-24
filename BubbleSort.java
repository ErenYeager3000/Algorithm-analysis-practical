import java.util.Scanner;

public class BubbleSort {

  static void bubble_sort(int[] arr, int n) {
    int size = arr.length;
    boolean swapped;
    for (int i = 0; i < size; i++) {
      swapped = false;
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped)
        break;
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

    bubble_sort(arr, n);
    System.out.println();

    System.out.println("After sorting the array : ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
