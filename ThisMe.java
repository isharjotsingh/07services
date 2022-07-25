public class Function {

public static void main(String[] args){
   
    Function obj = new Function();
    obj.testMe();
    obj.testMe(20);
}
void testMe()
{
System.out.println("hello world this is me");
}
void testMe(int a)
{
    System.out.println("a" +a);
}
}
