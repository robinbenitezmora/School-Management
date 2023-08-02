/**
 * This class is responsible for keeping track of
 * sudent fees, name, grade, and fees paid.
 */

public class Student {
 private int id;
 private String name;
 private int grade;
 private int feesPaid;
 private int feesTotal;

 /**
  * To create a new student by initializing.
  * Fees for every student is $25,000.
  * Fees paid initially is 0.
  * 
  * @param id    id for the student: unique.
  * @param name  name of the student.
  * @param grade grade of the student.
  */

 public Student(int id, String name, int grade) {
  this.feesPaid = 0;
  this.feesTotal = 25000;
  this.id = id;
  this.name = name;
  this.grade = grade;
 }

 // Not going to alter student's name, student's id.

 /**
  * Used to update the student's grade.
  * 
  * @param grade new grade of the student.
  */

 public void setGrade(int grade) {
  this.grade = grade;
 }

 /**
  * Keep adding the fees to feesPaid Field.
  * Add the fees to the fees paid.
  * The school is going to receive the funds.
  * 
  * @param fees the fees that the student pays.
  */

 public void payFees(int fees) {
  feesPaid += fees;
  School.updateTotalMoneyEarned(feesPaid);
 }

 /**
  * 
  * @return id of the student.
  */

 public int getId() {
  return id;
 }

 /**
  * 
  * @return name of the student.
  */

 public String getName() {
  return name;
 }

 /**
  * 
  * @return the grade of the student.
  */

 public int getGrade() {
  return grade;
 }

 /**
  * 
  * @return fees paid by the student.
  */

 public int getFeesPaid() {
  return feesPaid;
 }

 /**
  * 
  * @return the total fees of the student.
  */

 public int getFeesTotal() {
  return feesTotal;
 }

 /**
  * 
  * @return the remaining fees.
  */

 public int getRemainingFees() {
  return feesTotal - feesPaid;
 }
}