public class Student
{
  private String name;
  private int age;
  private int gradeLevel;

  // Constructor 
  public Student(String n, int a, int g)
  {
    name = n;
    age = a;
    gradeLevel = g;
  }

  //getter methods
  // getter method for name  
  public String getName()
  {
    return name;
  }

  // getter method for age 
  public int getAge()
  {
    return age;
  }

  // getter method for gradeLevel 
  public int getGradeLevel()
  {
    return gradeLevel;
  }

  // setter methods - used to create new values or change values of the instance variables/attributes.

  // setter method for name 
  public void setName(String n)
  {
    name = n;
  }

  // setter method for age 
  public void setAge(int a)
  {
    age = a;
  }

  // setter method for gradeLevel
  public void setGradeLevel(int g)
  {
    gradeLevel = g;
  }

  // toString method - for better description of the objects 
  public String toString()
  {
    return "The name is " + name + ", age " + age + ", and grade is " + gradeLevel;
  }

}