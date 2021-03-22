package Lesson4;

public class Main {

    public static void main(String[] args) {

        Employee[] ecorp = new Employee[5];

        ecorp[0] = new Employee("Ivanov Ivan", 32, "Lower", "111111", 6000);
        ecorp[1] = new Employee("Mira Maria",40, "Acconting", "222222", 5000);
        ecorp[2] = new Employee("Miha Mihail", 55, "Manager", "333333", 7000);
        ecorp[3] = new Employee("Alex Alex", 37, "Engineer", "444444", 6000);
        ecorp[4] = new Employee("Tigr Vasilii", 61, "Driver", "555555", 5000);


        for (Employee employee : ecorp)
            if (employee.getAge()>40)
                System.out.println(employee.name);


    }
}
