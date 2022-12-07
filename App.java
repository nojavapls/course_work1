import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner addPeople = new Scanner(System.in);
        ArrayList <Employee> people = new ArrayList<Employee>();
        System.out.printf("This is EmployeeBook Program!\nPlease enter info as First Name, Second Name, Surname \nDepartment number in range 1-5 \nAnd salary. Please be accurate! Thank you. Insert data: \n");
        for (int i = 0; i < 10; i++) {
            Employee em1 = new Employee(addPeople.next(), addPeople.next(), addPeople.next(), addPeople.nextInt(), addPeople.nextInt());
            people.add(i, em1);
        }
        EmployeeBook.getAllInfo(people);
        EmployeeBook.getAllInfo(people, 1);
        EmployeeBook.getAllSalary(people);
        EmployeeBook.getAllSalary(people, 1);
        EmployeeBook.getMidSalary(people);
        EmployeeBook.getMidSalary(people, 2);
        EmployeeBook.getMaxSalary(people);
        EmployeeBook.getMaxSalary(people, 2);
        EmployeeBook.getMinSalary(people);
        EmployeeBook.getMinSalary(people, 2);
        EmployeeBook.increaseSalary(people, 10);
        EmployeeBook.getAllSalary(people);
        EmployeeBook.increaseSalary(people, 1, 10);
        EmployeeBook.getAllSalary(people, 1);
        EmployeeBook.compareLess(people, 50000);
        EmployeeBook.compareMore(people, 300000);
        EmployeeBook.addNewEmployee(people);
        EmployeeBook.removeEmployee(people);
        EmployeeBook.changeEmployeeData(people);
        EmployeeBook.getAllInfo(people);
    }
}


