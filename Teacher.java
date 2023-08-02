public class Teacher {

 private int id;
 private String name;
 private int salary;
 private int salaryEarned;

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
  this.salaryEarned = 0;
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
  this.salary = salary;
 }

 /**
  * Adds to salaryEarned.
  * Removes from the total money earned by the school.
  * 
  * @param salary salary of the teacher.
  */

 public void receiveSalary(int salary) {
  salaryEarned += salary;
  School.updateTotalMoneySpent(salary);
 }

 @Override
 public String toString() {
  return "Name of the Teacher: " + name + " Total salary earned so far $" + salaryEarned;
 }
