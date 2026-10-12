void main() {

new Employee().name();
    new Student().name();
}

public class Person{

        private String name;
        public void name(){
            System.out.println("My name is person");
        }
}

public class Employee extends Person {
    private int id;
    @Override
    public void name(){
        System.out.println("My name is Employee");
    }

}
public class Student extends Person {
    private int id;
    @Override
    public void name(){
        System.out.println("My name is Student");
    }
}

public class Lec extends Person {
    private int id;
    @Override
    public void name(){
        System.out.println("My name is lecturer");
    }
}