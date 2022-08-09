//Fourth Question
class Rectangle {
   static void area(){
    System.out.println("area is pi r square ");
    }
    static int length=34;

    void circumference(){
        System.out.println("cicumference is 2 pi r");
    }
    int breadth=24;
    }
    class Shape extends Rectangle {
        public static void main(String[] args){
            Rectangle obj = new Rectangle();

            Rectangle.area();
            obj.circumference();
            System.out.println("length is "+Rectangle.length);
            System.out.println("breadth is "+obj.breadth);
            
        }

    }
