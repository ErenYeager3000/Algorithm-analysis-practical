import java.util.Scanner;

public class MergeSort {

  private static void merge(int[] arr, int l, int mid, int r){
int n1 = mid - l + 1;
int n2 = r - mid;

int[] lArr = new int[n1];
int[] rArr = new int[n2];

for(int i = 0; i < n1; i++){
  lArr[i] = arr[l+i];
}
for(int j = 0; j < n2; j++){
  rArr[j] = arr[mid+1+j];
}
int i = 0, j = 0, k = l;
while(i < n1 && j < n2){
if(lArr[i] <= rArr[j]){
  arr[k] = lArr[i];
  i++;
}else{
  arr[k] = rArr[j];
  j++;
}
k++;
}
   while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
  

public static void merge_sort(int[] arr, int l, int r){
  if(l < r){
    int mid = (l + r) / 2;
    merge_sort(arr, l, mid);
    merge_sort(arr, mid+1, r);

    merge(arr, l, mid, r);
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

    merge_sort(arr,0,n-1);
    System.out.println();

    System.out.println("After sorting the array : ");
    for (int num : arr) {
      System.out.print(num + " ");

      sc.close();
    }
  }
}
