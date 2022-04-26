package employee;
import companies.Company;
import tasks.Task;

public class Architech extends Employee {

    public Architech(String name, int employeeId, int salary, Company company){
        super(name, employeeId, salary, company);
    }

    @Override
    public Task work(){
        Task task = this.employer.getArchitectualBackLog().pop();
        System.out.println(task.getDescription());
        task.setComplete(true);
        return task;
    }

    @Override
    public Task work(Task task){
        return  null;
    }
}
