//Q 3
/*
1.-   .java file is file in which we right code and compile it.
      it also contain java source code.
     
     while .class is file create by compiler and save it and show the output.
      it contain java bytecode.

2.-  java is not a complete OOP's programming language because it contain primitive data types like int, byte, etc. which are not object.

3.-  NR-WA example are given in code
*/
public class A{
    public static void main(String[] args){
     A obj = new A();
     obj.test(20);  }

     void test(int c){
        System.out.println(+c);
     }
}