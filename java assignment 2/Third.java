import java.util.Scanner;
public class Third {   //3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("the number is equal");
        }
        else if(a != b){
            System.out.println("the number is not equal");
            if(a > b){
                System.out.println("the first number is greater i.e. " +a);
            }
            else{
                System.out.println("the second number is greater i.e. " +b);
            }
            
        }
}
}