import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Teacher lizzy = new Teacher(1, "Lizzy", 500);
    Teacher mellisa = new Teacher(2, "Mellisa", 700);
    Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(lizzy);
    teacherList.add(mellisa);
    teacherList.add(vanderhorn);

    Student tamasha = new Student(1, "Tamasha", 4);
    Student rakshith = new Student(2, "Rakshith Vasudev", 12);
    Student rabbi = new Student(3, "Rabbi", 5);

    List<Student> studentList = new ArrayList<>();
    studentList.add(tamasha);
    studentList.add(rakshith);
    studentList.add(rabbi);

    School ghs = new School(teacherList, studentList);

    Teacher megan = new Teacher(6, "Megan", 900);
    ghs.addTeacher(megan);

    Student.payFees(5000);
    Student.payFees(6000);
    System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

    System.out.println("------Making SCHOOL PAY SALARY----");
    Teacher.receiveSalary(lizzy.getSalary());
    System.out.println("GHS has spent for salary to " + lizzy.getName()
        + " and now has $" + ghs.getTotalMoneyEarned());

    Teacher.receiveSalary(vanderhorn.getSalary());
    System.out.println("GHS has spent for salary to " + vanderhorn.getName()
        + " and now has $" + ghs.getTotalMoneyEarned());

    System.out.println(rakshith);
    System.out.println(megan);
    System.out.println(lizzy);
    System.out.println(vanderhorn);
    System.out.println(tamasha);
    System.out.println(rabbi);
    System.out.println(ghs);
    System.out.println(teacherList);
    System.out.println(studentList);
    System.out.println(ghs.getTotalMoneyEarned());
    System.out.println(ghs.getTotalMoneySpent());
    System.out.println(megan.getId());
    System.out.println(megan.getName());
    System.out.println(megan.getSalary());
    System.out.println(megan.getSalary());
    System.out.println(megan);
    System.out.println(lizzy.getId());
    System.out.println(lizzy.getName());
    System.out.println(lizzy.getSalary());
  }
}
