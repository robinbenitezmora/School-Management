public class Teacher {

 private int id;
 private String name;
 private static int salary;

 /**
  * Creates a new Teacher object.
  * 
  * @param id     id for the teacher.
  * @param name   name of the teacher.
  * @param salary salary of the teacher.
  */

 public Teacher(int id, String name, int salary) {
  this.id = id;
  this.name = name;
  this.salary = salary;
 }

 /**
  * Returns the id of the teacher.
  * 
  * @return id of the teacher.
  */

 public int getId() {
  return id;
 }

 /**
  * Returns the name of the teacher.
  * 
  * @return name of the teacher.
  */

 public String getName() {
  return name;
 }

 /**
  * Returns the salary of the teacher.
  * 
  * @return salary of the teacher.
  */

 public int getSalary() {
  return salary;
 }

 /**
  * Sets the salary.
  * 
  * @param salary salary of the teacher.
  */

 public void setSalary(int salary) {
  Teacher.salary = salary;
 }

 public static void receiveSalary(int salary) {
  School.updateTotalMoneySpent(salary);
 }

 @Override
 public String toString() {
  return "Teacher's name: " + name + "\nTotal salary earned so far: $" + salary;
 }
}