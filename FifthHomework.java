package ru.geekbrains.homework.fifth; //Kozko

public class FifthHomework {

    public static void main(String[] args) {


        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Tom Hanks", 64, "experienced actor",
                "hanksforever53@yahoo.com", "+12130000000", 100500);
        employeeArr[1] = new Employee("Henry Cavill", 37, "lead actor",
                "sirHenry@yahoo.com", "+44780000000", 100499);
        employeeArr[2] = new Employee("Norman Mark Reedus", 52, "supporting actor",
                "reedusGreatMen@google.com", "+16310000000", 100498);
        employeeArr[3] = new Employee("Jeffrey Dean Morgan", 54, "supporting actor",
                "charmer@google.com", "+12020000000", 100497);
        employeeArr[4] = new Employee("Daniel Jacob Radcliffe", 31, "one-trick",
                "DJR@yahoo.com", "+44200000000", 90500);


        for(int i = 0; i < employeeArr.length; i++) {
            if(employeeArr[i].getAge() > 40) {
                employeeArr[i].print();
            }
        }

    }
}
