//q1
/*  encapsulation -: it is a process in which class varible is hide from other class and can be accessed by method of the class.
 */
//Example
import java.util.Scanner;
public class FirstQuestion {
    public static void main(String[] args){
        System.out.println("this is Encapsulation");
    Scanner sc = new Scanner(System.in);
    PtuLogin obj = new PtuLogin();
    System.out.println("enter the Id");
    String a = sc.nextLine();
    System.out.println("your id is"+obj.getId(a));
    obj.setId(a,9878);
    System.out.println("your updated id is"+obj.getId(a));

    }
}
class PtuLogin{
    private final String id = "abcd";
    private int password = 0000;
  
    int getId(String id){
        if(checkId(id)){
            return password;
        }return 0;
 }
   void setId(String id,int password){
    if(checkId(id)){
        this.password= password;
    }
   }
   boolean checkId(String id){
    return this.id.equals(id);
   }
}

    

