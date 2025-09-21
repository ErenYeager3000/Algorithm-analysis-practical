import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
    System.out.println("Enter the number of items you want to enter : ");
    int n = sc.nextInt();
    int i, beg = 0, end = n - 1, pos = -1, mid = 0;

    int[] a = new int[n];

    System.out.println("Enter the array elements : ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    System.out.println("Enter the item : ");
    int item = sc.nextInt();

    while (beg <= end) {
      mid = (beg + end) / 2;
      if (item == a[mid]) {
        pos = i;
        break;
      } else if (item > a[mid]) {
        beg = mid + 1;
      } else if (item < a[mid]) {
        end = mid - 1;
      }
    }

    if (pos == -1) {
      System.out.println("Item not found. / Item doesn't exist.");
    } else {
      System.out.println("Item " + item + " found at : " + mid);
    }
    } finally {
        sc.close();
    }
  }
}
