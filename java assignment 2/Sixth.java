import java.util.Scanner;  //6
public class Sixth {
    public static void main(String[] args){
      System.out.print("enter the number to perform loop upto that");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(i);
        }
    }
    
}
