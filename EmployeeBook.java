import java.util.*;

public class EmployeeBook {

    public static void getAllInfo(ArrayList<Employee> people) {
        if (people.size() != 0) {
            for (int i = 0; i != people.size(); i++) {
                if (people.get(i) != null) {
                    System.out.println(people.get(i).toString());
                }
            }
        }
    }
    public static void getAllInfo(ArrayList<Employee> people, int department) {
        int a = 0;
        if (people.size() != 0) {
            System.out.println("List of employees of department " + department + ": ");
            while (a < people.size()) {
                if (people.get(a) != null && (people.get(a).getDepartment() == department)) {
                        System.out.println(people.get(a).toStringDepartment());
                    a++;
                }
            }
        }
    }

    public static void compareLess(ArrayList<Employee> people, int compare) {
        int a = 0;
        Boolean flag = false;
        if (people.size() != 0) {
            System.out.println("List of employees with salary less than " + compare + ": ");
            while (a < people.size()) {
                if (people.get(a) != null && (people.get(a).getSalary() < compare)) {
                    System.out.println(people.get(a).toStringId());
                    flag = true;
                a++;
            }
        }
            if (flag == false)
                System.out.println("No employee with salary less than "+compare);
        }
    }

    public static void compareMore(ArrayList<Employee> people, int compare) {
        int a = 0;
        Boolean flag = false;
        if (people.size() != 0) {
            System.out.println("List of employees with salary more or equal " + compare + ": ");
            while (a < people.size()) {
                if (people.get(a) != null && (people.get(a).getSalary() >= compare)) {
                    flag = true;
                    System.out.println(people.get(a).toStringId());
                }
                a++;
            }
        }
            if (flag == false)
                System.out.println("No employee with salary more or equal "+compare);
    }


    public static void getAllSalary(ArrayList<Employee> people) {

        int allSalary = 0;
        if (people.size() != 0) {
            for (int i = 0; i != people.size(); i++) {
                if (people.get(i) != null) {
                    allSalary += people.get(i).getSalary();
                }
            }
            System.out.println("Total salary per month is: " + allSalary);
        }
    }

    public static void getAllSalary(ArrayList<Employee> people, int department) {

        int allSalary = 0;
        int a = 0;
        if (people.size() != 0) {
            while (a < people.size()) {
                if (people.get(a) != null && (people.get(a).getDepartment() == department)) {
                        allSalary += people.get(a).getSalary();
                }
                a++;
            }
        }
            System.out.println("Total salary per month in department " + department + " is " + allSalary);
        }

    public static void getMidSalary(ArrayList<Employee> people) {

        int i = 0;
        int allSalary = 0;
        if (people.size() != 0) {
            while (i < people.size()) {
                if (people.get(i) != null) {
                    allSalary += people.get(i).getSalary();
                    i++;
                }
            }
            System.out.println("Average salary among employees is: " + allSalary / Employee.getNumOfInstances());
        }
    }

    public static void getMidSalary(ArrayList<Employee> people, int department) {

        int counter = 0;
        int allSalary = 0;
        int a = 0;
        if (people.size() != 0) {
            while (a < people.size()) {
                if (people.get(a) != null && (people.get(a).getDepartment() == department)) {
                        allSalary += people.get(a).getSalary();
                        counter++;
                    }
                    a++;
                }
            if (counter > 0)
                System.out.println("Average salary among employees in department " + department + " is: " + allSalary / counter);
            else
                System.out.println("No people in department " + department);
        }
    }

    public static void increaseSalary(ArrayList<Employee> people, int percent) {
        int i = 0;
        if (people.size() != 0) {
            while (i < people.size()) {
                if (people.get(i) != null) {
                people.get(i).setSalary(people.get(i).getSalary() + people.get(i).getSalary() / 100 * percent);
                i++;
            }
        }
            System.out.println("All employees salary indexed on " + percent + "% percents. Congrants!");
        }
    }

    public static void increaseSalary(ArrayList<Employee> people, int department, int percent) {

        int a = 0;
        if (people.size() != 0) {
            while (a < people.size()) {
                if (people.get(a) != null && (people.get(a).getDepartment() == department)) {
                    people.get(a).setSalary(people.get(a).getSalary() + people.get(a).getSalary() / 100 * percent);
                    a++;
                }
            }
            System.out.println("All salary for employees in department " + department + " are indexed on " + percent + "% percents. Congrants!");
        }
    }

    public static void getMaxSalary(ArrayList<Employee> people) {
        int max = people.get(0).getSalary();
        int i = 0;
        int index = 0;
        if (people.size() != 0) {
            while (i < people.size()) {
                if (people.get(i) != null) {
                if (max <= people.get(i).getSalary()) {
                    max = people.get(i).getSalary();
                    index = i;
                }
                i++;
            }
        }
            System.out.println("Max salary has: " + people.get(index).toStringName());
        }
    }

    public static void getMaxSalary(ArrayList<Employee> people, int department) {
        int max = 0;
        int a = 0;
        Boolean flag = false;
        if (people.size() != 0) {
            while (a < people.size()) {
                if (people.get(a) != null) {
                    if (people.get(a).getDepartment() == department) {
                    max = people.get(a).getSalary();
                    flag = true;
                    break;
                } else a++;
            }
        }
            int i = 0;
            int index = 0;
            if (flag == true) {
                while (i < people.size()) {
                    if (people.get(i) != null) {
                    if (max < people.get(i).getSalary() && people.get(i).getDepartment() == department) {
                        max = people.get(i).getSalary();
                        index = i;
                    }
                    i++;
                }
            }
                System.out.println("Max salary in department " + department + " has: " + people.get(index).toStringName());
            } else
                System.out.println("No people in department " + department);
        }
    }

    public static void getMinSalary(ArrayList<Employee> people) {
        int min = people.get(0).getSalary();
        int i = 0;
        int index = 0;
        if (people.size() != 0) {
            if (people.get(i) != null) {
                while (i < people.size()) {
                    if (min >= people.get(i).getSalary()) {
                        min = people.get(i).getSalary();
                        index = i;
                    }
                    i++;
                }
                System.out.println("Min salary has: " + people.get(index).toStringName());
            }
        }
    }

    public static void getMinSalary(ArrayList<Employee> people, int department) {
        int min = 0;
        int a = 0;
        Boolean flag = false;
        if (people.size() != 0) {
            while (a < people.size()) {
                if (people.get(a) != null) {
                if (people.get(a).getDepartment() == department) {
                    min = people.get(a).getSalary();
                    flag = true;
                    break;
                } else a++;
            }
        }
            int i = 0;
            int index = 0;
            if (flag == true) {
                while (i < people.size()) {
                    if (people.get(i) != null) {
                    if (min >= people.get(i).getSalary() && people.get(i).getDepartment() == department) {
                        min = people.get(i).getSalary();
                        index = i;
                    }
                    i++;
                }
            }
                System.out.println("Min salary in department " + department + " has: " + people.get(index).toStringName());
            } else
                System.out.println("No people on department " + department);
        }
    }

    public static void addNewEmployee(ArrayList<Employee> people) {

        Scanner addPeople = new Scanner(System.in);

        System.out.println("Enter new employee name, second name, surname, department, salary: ");
        Employee em1 = new Employee(addPeople.next(), addPeople.next(), addPeople.next(), addPeople.nextInt(), addPeople.nextInt());
        people.add(em1);
    }

    public static void removeEmployee(ArrayList<Employee> people) {

        Boolean flag = false;
        Scanner remPeople = new Scanner(System.in);
        System.out.println("Remove by Name or ID? write Name or ID here: ");
        String answer = remPeople.next();
        if (answer.equals("Name") || answer.equals("name")) {
            System.out.println("Enter Name, Second name, Surname of employee to remove: ");
            String name = remPeople.next();
            String secondName = remPeople.next();
            String surname = remPeople.next();
            if (people.size() != 0) {
                for (int i = 0; i < people.size(); i++) {
                    if (people.get(i) != null) {
                    if (people.get(i).getName().equals(name) && people.get(i).getSecondName().equals(secondName) && people.get(i).getSurname().equals(surname)) {
                        people.remove(i);
                        flag = true;
                    }
                    i++;
                }
            }
            }
        }
        else
        {
            System.out.println("Enter ID of employee to remove: ");
            int id = remPeople.nextInt();
            if (people.size() != 0) {
                for (int i = 0; i < people.size(); i++) {
                    if (people.get(i) != null) {
                    if (people.get(i).getId() == id) {
                        people.remove(i);
                        flag = true;
                    }
                    i++;
                }
            }
            }

        }
        if (flag == false)
            System.out.println("No such employee");
    }

    public static void changeEmployeeData(ArrayList<Employee> people) {

        Boolean flag = false;
        Scanner remPeople = new Scanner(System.in);
        System.out.println("Changing info. Search by Name or ID? ATTENTION! write 1 WORD name or ID here: ");
        String answer = remPeople.next();
        System.out.println("Change salary or department? ATTENTION! write 1 WORD: salary or department here: ");
        String subject = remPeople.next();
        if (answer.equals("Name") || answer.equals("name")) {
            System.out.println("Enter Name, Second name, Surname of employee to change info: ");
            String name = remPeople.next();
            String secondName = remPeople.next();
            String surname = remPeople.next();
            if (people.size() != 0) {
                System.out.println("HERE");
                for (int i = 0; i < people.size(); i++) {
                    if (people.get(i) != null) {
                    if (people.get(i).getName().equals(name) && people.get(i).getSecondName().equals(secondName) && people.get(i).getSurname().equals(surname)) {
                        System.out.println("QUQU");
                        if (subject.equals("salary")) {
                            System.out.printf("Enter salary to set: ");
                            int salary = remPeople.nextInt();
                            people.get(i).setSalary(salary);
                            flag = true;
                        } else {
                            System.out.printf("Enter department to set: ");
                            int department = remPeople.nextInt();
                            people.get(i).setDepartment(department);
                            flag = true;
                        }
                    }
                    i++;
                }
            }
            }
        }
        else
        {
            System.out.println("Enter ID of employee to change info: ");
            int id = remPeople.nextInt();
            if (people.size() != 0) {
                for (int i = 0; i < people.size(); i++) {
                    if (people.get(i).getId() == id) {
                        if (people.get(i) != null) {
                        if (subject.equals("department")) {
                            System.out.printf("Enter department to set: ");
                            int department = remPeople.nextInt();
                            people.get(i).setDepartment(department);
                            flag = true;
                        } else {
                            System.out.printf("Enter salary to set: ");
                            int salary = remPeople.nextInt();
                            people.get(i).setSalary(salary);
                            flag = true;
                        }
                    }
                    i++;
                }
            }
            }

        }
        if (flag == false)
            System.out.println("No such employee");
    }
}