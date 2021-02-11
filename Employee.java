package ru.geekbrains.homework.fifth;

public class Employee {
    private String fullName;
    private int age;
    private String position;
    private String email;
    private String phone;
    private int wage;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Employee(String fullName, int age, String position, String email, String phone, int wage) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
    }

    public void print() {
        System.out.println("\nEmployee name: " + fullName + ", age: " + age + ", phone number: " + phone);
        System.out.println("position: " + position + ", email: " + email + ", wage: " + wage);
    }
}
