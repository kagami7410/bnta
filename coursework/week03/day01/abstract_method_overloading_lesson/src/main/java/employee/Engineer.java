package employee;

import companies.Company;
import tasks.Task;

public class Engineer extends Employee{

    public Engineer(String name, int employeeId, int salary, Company company){
        super(name, employeeId, salary, company);
    }

    @Override
    public Task work(){
        Task task = this.employer.getEngineeringBackLog().pop();
        System.out.println(task.getDescription());
        task.setComplete(true);
        return task;
    }

    @Override
    public Task work(Task task){
        return  null;
    }
}
