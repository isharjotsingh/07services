//q2
/* polymorphism -: the word 'poly' means "many" and the word 'morphism' means "form". it means many form.
   it has occur when many classes are related to each other by inheritance.

   overriding -: it has same name, same return and same argument.
   overloading -: it has same name, different return and differnt argument.
 */
 
 class SecondQuestion {
    void familyName() {
        System.out.println("Mann");
}

static void property() {
    System.out.println("Habbit");
}
}

class Duja extends SecondQuestion {
public static void main(String args[]) {
    
    Duja objChild = new Duja();
    objChild.name();
    
    SecondQuestion object = new SecondQuestion();
    object.familyName();
    objChild.familyName();
    objChild.familyName("baljit");
}

void name() {
    System.out.println("Name ");
}

void familyName() {
    super.familyName();
    System.out.println("Mann in Duja ");
}

void familyName(String middleName) {
    super.familyName();
    System.out.println("2nd Mann in Duja ");
}
}
    

