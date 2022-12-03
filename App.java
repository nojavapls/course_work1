import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner addPeople = new Scanner(System.in);
        Employee[] people = new Employee[6];
        System.out.printf("This is EmployeeBook Program!\nPlease enter info as First Name, Father Name, Surname \nDepartment number in range 1-5 \nAnd salary. Please be accurate! Thank you. Insert data: ");

        for (int i = 0; i < 6; i++) {
            people[i] = new Employee(addPeople.next(), addPeople.next(), addPeople.next(), addPeople.nextInt(), addPeople.nextInt());
        }
        System.out.println(Employee.getNumOfInstances());
        getAllInfo(people);
        getAllInfo(people, 1);
        getAllSalary(people);
        getAllSalary(people, 1);
        getMidSalary(people);
        getMidSalary(people, 2);
        getMaxSalary(people);
        getMaxSalary(people, 2);
        getMinSalary(people);
        getMinSalary(people, 2);
        increaseSalary(people, 10);
        getAllSalary(people);
        increaseSalary(people, 1, 10);
        getAllSalary(people, 1);
        compareLess(people, 150);
        compareMore(people, 300);

    }

    public static void getAllInfo(Employee[] people) {
        for (int i = 0; i != people.length; i++) {
            System.out.println(people[i].toString());
//
        }
    }
    public static void getAllInfo(Employee[] people, int department) {
        int a = 0;
        System.out.println("List of employees of department "+department+": \n");
        while (a < people.length) {
            if (people[a].getDepartment() == department) {
                System.out.println(people[a].toStringDepartment());
            }
            a++;
        }
    }

    public static void compareLess(Employee[] people, int compare) {
        int a = 0;
        System.out.println("List of employees with salary less than "+compare+": \n");
        while (a < people.length) {
            if (people[a].getSalary() < compare) {
                System.out.println(people[a].toStringId());
            }
            a++;
        }
    }

    public static void compareMore(Employee[] people, int compare) {
        int a = 0;
        System.out.println("List of employees with salary more or equal "+compare+": \n");
        while (a < people.length) {
            if (people[a].getSalary() >= compare) {
                System.out.println(people[a].toStringId());
            }
            a++;
        }
    }

    public static void getAllSalary(Employee[] people) {

        int allSalary = 0;
        for (int i = 0; i != people.length; i++) {
            allSalary += people[i].getSalary();
        }
        System.out.println("Total salary per month is: " + allSalary);
    }

    public static void getAllSalary(Employee[] people, int department) {

        int allSalary = 0;
        int a = 0;
        while (a < people.length) {
            if (people[a].getDepartment() == department) {
                allSalary += people[a].getSalary();
                System.out.println(people[a].getSalary());
               }
            a++;
        }
        System.out.println("Total salary per month in department "+ department + " is " + allSalary);
    }

    public static void getMidSalary(Employee[] people) {

        int i = 0;
        int allSalary = 0;
        while (i < people.length) {
            allSalary += people[i].getSalary();
            i++;
        }
        System.out.println("Average salary among employees is: " + allSalary/Employee.getNumOfInstances());
    }

    public static void getMidSalary(Employee[] people, int department) {

        int counter = 0;
        int allSalary = 0;
        int a = 0;
        while (a < people.length) {
            if (people[a].getDepartment() == department) {
                allSalary += people[a].getSalary();
                counter++;
            }
            a++;
        }
        System.out.println("Average salary among employees in department " + department + " is: " + allSalary/counter);
    }

    public static void increaseSalary(Employee[] people, int percent) {
        int i = 0;
        while (i < people.length)  {
            people[i].setSalary(people[i].getSalary() + people[i].getSalary()/100*percent);
            i++;
        }
        System.out.println("All employees salary indexed on "+ percent +"% percents. Congrants!");
    }

    public static void increaseSalary(Employee[] people, int department, int percent) {

        int a = 0;
        while (a < people.length) {
            if (people[a].getDepartment() == department)
                people[a].setSalary(people[a].getSalary() + people[a].getSalary()/100*percent);
            a++;
        }
        System.out.println("All salary for employees in department " + department+ " are indexed on "+ percent +"% percents. Congrants!");
    }

    public static void getMaxSalary(Employee[] people) {
        int max = people[0].getSalary();
        int i = 0;
        int index = 0;
        while (i < people.length) {
            if (max <= people[i].getSalary()) {
                max = people[i].getSalary();
                index = i;
            }
            i++;
        }
        System.out.println("Max salary has: " + people[index].toStringName());
    }

    public static void getMaxSalary(Employee[] people, int department) {
        int max = 0;
        int a = 0;
        while (a < people.length) {
            if (people[a].getDepartment() == department) {
                max = people[a].getSalary();
                break ;}
            else a++;
        }
        int i = 0;
        int index = 0;
        while (i < people.length) {
            if (max < people[i].getSalary() && people[i].getDepartment() == department) {
                max = people[i].getSalary();
                index = i;
            }
            i++;
        }
        System.out.println("Max salary in department " + department + " has: " + people[index].toStringName());
    }

    public static void getMinSalary(Employee[] people) {
        int min = people[0].getSalary();
        int i = 0;
        int index = 0;
        while (i < people.length) {
            if (min >= people[i].getSalary()) {
                min = people[i].getSalary();
                index = i;
            }
                i++;
        }
        System.out.println("Min salary has: " + people[index].toStringName());
    }

    public static void getMinSalary(Employee[] people, int department) {
        int min = 0;
        int a = 0;
        while (a < people.length) {
            if (people[a].getDepartment() == department) {
                min = people[a].getSalary();
                break ;}
            else a++;
        }
        int i = 0;
        int index = 0;
        while (i < people.length) {
            if (min >= people[i].getSalary() && people[i].getDepartment() == department) {
                min = people[i].getSalary();
                index = i;
            }
            i++;
        }
        System.out.println("Min salary in department " + department+ "has: " + people[index].toStringName());
    }
}


