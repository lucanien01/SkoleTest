package assignment4;

public class Student
{
    /* Imaginary high school students can have their grade multiplied with a number if they
     * take a higher level course (1.06) or goes direct to university (1.08)
     * If they do both, they will get 1.06 * 1.08 = 1.1448 */

    /* The constructor must create a new student object with default values for
     * the multiplier and grade variables:
     * The multiplier should default to 1.06. Grade default to 0.0
     * all instance variables in the constructor must be set by their
     * setter methods not by setting it directly
     * setName(name)  // <--- correct this.name = name // <--- wrong */

    private int studentId;
    private String name;
    private int grade;
    private double multiplier;

    public Student(int studentId, String name){
        setStudentId(studentId);
        setName(name);
        setGrade(0);
        setMultiplier(1.06);
    }

    // The setter for the multiplier must check that the value is either

    public boolean setMultiplier(double multiplier){

        if(multiplier == 1.06 || multiplier == 1.08 || multiplier == 1.06 * 1.08){
            this.multiplier = multiplier;
            return true;
        }

        return false;
    }

    // The setter for grade, must check that it is a value from the 7-point scale, valid values are: -3, 0, 2, 4, 7, 10, 12

    public boolean setGrade(int grade){
        if (grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12){
            this.grade = grade;
            return true;
        }

        return false;
    }

    /* The setter for name, must check that the name is valid. A name must hold
     * at least 2 words (separated by space) A name must not be null or empty. A
     * name cannot have the following characters: .\/,()&%€#!$ Do not set the
     * value, if the name is not valid. */

    public boolean setName(String name){
        if (name == null || name.trim().isEmpty()){
            return false;
        }

        if (name.trim().split("\\s+").length < 2){
            return false;
        }

        if (name.matches(".*[./\\\\,()&%€#!$].*")){
            return false;
        }

        this.name = name;
        return true;
    }

    // The setter for studentId must check that it is larger than -1 Do not set the value, if this is false.

    public boolean setStudentId(int studentId){
        if (studentId > -1){
            this.studentId = studentId;
            return true;
        }

        return false;
    }

    // Return the value of the grade multiplied by the multiplier.

    public double getComputedGrade(){
        return grade * multiplier;
    }

    // Return the value of the instance field

    public int getStudentId(){
        return studentId;
    }

    // Return the value of the instance field

    public double getMultiplier(){
        return multiplier;
    }

    // Return the value of the instance field

    public int getGrade(){
        return grade;
    }

    // Return the value of the instance field

    public String getName(){
        return name;
    }

}