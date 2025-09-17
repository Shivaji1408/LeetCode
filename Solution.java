public class Solution {
    abstract class Person {
        abstract void display();
    }
    static class Student extends Person {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display()  {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
    
    public static void main(String args[]){
        Student student1 = new Student();
        student1.display();
    }
}