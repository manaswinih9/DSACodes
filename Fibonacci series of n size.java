import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (n == 0) {
        System.out.print(0);
    } 
    else {
      int secondLast = 0;
      int last = 1;
      System.out.print(secondLast + " " + last + " ");
      int cur;
      for (int i = 2; i < n; i++) {
        cur = last + secondLast;
        System.out.print(cur + " ");
        secondLast = last;
        last = cur;
        
      }
    }
  }
}
