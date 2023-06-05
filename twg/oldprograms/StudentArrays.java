class Student{
    String student_name;
    int age;
    Student(String student_name, int age) {
        this.student_name = student_name;
        this.age = age;
    }

}
public class StudentArrays {
    public static void main(String args[]){
        Student s1 = new Student("santosh",36);
        Student s2 = new Student("sateesh",32);
        Student[] students = new Student[]{s1, s2}; //Demo to show arrays with objects
        for (int i=0;i<students.length;i++){
            System.out.println(students[i].student_name);
            System.out.println(students[i].age);
        }
    }

    }