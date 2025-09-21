import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of items you want to enter : ");
    int n = sc.nextInt();

    int[] a = new int [n];

    System.out.println("Enter the array elements : ");
    for(int i =0; i < n; i++){
      a[i] = sc.nextInt();
    }

    System.out.println("Enter the item : ");
    int item = sc.nextInt();
int pos = -1;
    for(int i = 0; i < a.length; i++){
     if (a[i]==item){
pos = i;
break;
     } 
    }
     if(pos==-1){
      System.out.println("Item doesn't exist.");
     }else{
      System.out.println("Item " + item + " fount at : " + (pos+1));
     }

    sc.close();
  }
}
