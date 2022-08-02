// pass by value =   // q5
 /*   it is value in which we give to one variable and that variable pass to second variable after some change in first or actual variable the change of value is not pass to second variable as shown in given example. 

 // pass by reference =
  it is value in which we give to one  variable and that variable pass to second variable after some change in first or actual variable the change of value is pass to second variable as shown in given example.
*/


//Example

public class Fifth {
    public static void main(String[] args){
      /*   int a = 40;  // for pass by value
        int b = a;
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);
        a = 50;
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);
*/
test obj = new test();  // for pass by reference
    System.out.println("the value of c is "+obj.c);
    obj.c=44;
    System.out.println("the value of c is "+obj.c);
    test.method();
    }}
     class test{
       static int c=88;
      static  void method(){
            System.out.println("the value of c is in gopy class is "+c);

    }
    
}
