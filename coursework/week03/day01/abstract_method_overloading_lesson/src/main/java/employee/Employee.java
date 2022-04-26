package employee;
import tasks.Task;

import java.util.LinkedList;
import java.util.List;
import companies.Company;

public abstract class Employee{
    private String name;
    private int employeeId;
    private int salary;
    protected LinkedList<Task> backlog;

    protected Company employer;

    public Employee(String name, int employeeId, int salary, Company employer) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.employer = employer;
        setEmployer(employer);
        // FIFO - first in first out
        backlog = new LinkedList();
    }
    public void setEmployer(Company company){
        employer = company;
    }

        public void addTask(Task task){
            backlog.add(task);
        }

        public abstract Task work();
        public abstract Task work(Task task);


}
