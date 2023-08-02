import java.util.List;

/**
 * This class is responsible for keeping track of teachers, students, and total
 * money earned and spent.
 * 
 * School can have many teachers, many students.
 * 
 * Implements teachers and students using an ArrayList.
 * Implements total money earned and total money spent.
 * 
 */
public class School {

 private List<Teacher> teachers;
 private List<Student> students;
 private static int totalMoneyEarned;
 private static int totalMoneySpent;

 public School(List<Teacher> teachers, List<Student> students) {
  this.teachers = teachers;
  this.students = students;
  totalMoneyEarned = 0;
  totalMoneySpent = 0;
 }

 /**
  * 
  * @return the list of teachers in the school.
  *
  */

 public List<Teacher> getTeachers() {
  return teachers;
 }

 /**
  * Adds a teacher to the school.
  * 
  * @param teacher the teacher to be added.
  */

 public void addTeacher(Teacher teacher) {
  teachers.add(teacher);
 }

 /**
  * 
  * @return the list of students in the school.
  */

 public List<Student> getStudents() {
  return students;
 }

 /**
  * Adds a student to the school.
  * 
  * @param student the student to be added.
  */

 public void addStudent(Student student) {
  students.add(student);
 }

 /**
  * 
  * @return the total money earned by the school.
  */

 public int getTotalMoneyEarned() {
  return totalMoneyEarned;
 }

 /**
  * Adds the total money earned by the school.
  * 
  * @param MoneyEarned money that is supposed to be added.
  */

 public static void updateTotalMoneyEarned(int MoneyEarned) {
  totalMoneyEarned += MoneyEarned;
 }
}
