import java.lang.constant.Constable;

public class Employee {

    private String name;
    private String secondName;
    private String surname;
    private int department;
    private int salary;
    private static int counter = 0;
    private int id;


    public Employee(String name,  String secondName, String surname, int department, int salary){
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        if (department > 0 && department < 6)
            this.department = department;
        else
            throw new IllegalArgumentException("Incorrect departmetn number: must be 1-5");
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public int getDepartment(){
        return this.department;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setDepartment(int department){
        if (department > 0 && department < 6)
            this.department = department;
        else
            throw new IllegalArgumentException("Incorrect departmetn number: must be 1-5");
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString()
    {
        return "Id: " + this.id + ", name: " + this.name + " " +  this.secondName+ " " +  this.surname+ " | Department Number: " +  this.department+ " | Salary: " +  this.salary;
    }

    public String toStringName()
    {
        return this.name + " " +  this.secondName+ " " +  this.surname;
    }

    public String toStringDepartment()
    {
        return this.name + " " +  this.secondName+ " " +  this.surname + " " + this.salary;
    }
    public String toStringId()
    {
        return this.id + " "+this.name + " " +  this.secondName+ " " +  this.surname + " " + this.salary;
    }
    public static int getNumOfInstances() {
        return counter;
    }
}
