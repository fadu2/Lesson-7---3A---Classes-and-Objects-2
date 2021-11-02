class Main {
  public static void main(String[] args) {
    Student joe = new Student("Joe Smith", 16, 11);
    // System.out.println(joe.name);
    // System.out.println(joe.age);
    String joesName = joe.getName();
    System.out.println(joesName);
    System.out.println(joe.getAge());
    System.out.println(joe.getGradeLevel());
    joe.setName("Joey Smith");
    System.out.println(joe.getName());
    joe.setAge(17);
    System.out.println("Joe's age is now " + joe.getAge());
    joe.setGradeLevel(12);
    System.out.println("Joe's new grade is " + joe.getGradeLevel());
    
    Student neil = new Student("Neil Armstrong", 14, 9);
    System.out.println(neil.getName());
    System.out.println(neil.getAge());
    System.out.println(neil.getGradeLevel());

    System.out.println(joe);
    System.out.println(neil);
    
  }
}