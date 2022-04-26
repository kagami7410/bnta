public class Employee {
    private  String name;
    private int balance;
    private int salary;
    private Company employer;

    public Employee(String name, int balance, int salary) {
        this.name = name;
        this.balance = balance;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int getSalary(){
        return salary;
    }
}
