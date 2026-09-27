public class PassByValue {


    static void changeNumber(int number) {
        number = 100;
        System.out.println("Inside changeNumber(): " + number);
    }


    static void changeStudent(Student student) {
        student.name = "Sai";
        System.out.println("Inside changeStudent(): " + student.name);
    }


    static void replaceStudent(Student student) {
        student = new Student("Kuricheti");
        System.out.println("Inside replaceStudent(): " + student.name);
    }

    public static void main(String[] args) {

        // Primitive variable
        int number = 10;

        System.out.println("Before changeNumber(): " + number);
        changeNumber(number);
        System.out.println("After changeNumber(): " + number);

        System.out.println();

        // Object
        Student student = new Student("Charan");

        System.out.println("Before changeStudent(): " + student.name);
        changeStudent(student);
        System.out.println("After changeStudent(): " + student.name);

        System.out.println();

        // Replacing the object reference
        System.out.println("Before replaceStudent(): " + student.name);
        replaceStudent(student);
        System.out.println("After replaceStudent(): " + student.name);
    }
}