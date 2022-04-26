package employee;

import companies.Company;
import tasks.Task;

public class Software_Developer extends Employee{

        public Software_Developer(String name, int employeeId, int salary, Company company){
            super(name, employeeId, salary, company);
        }

        @Override
        public Task work(){
            Task task = this.employer.getSoftwareBackLog().pop();
            System.out.println(task.getDescription());
            task.setComplete(true);
            return task;
        }

        @Override
        public Task work(Task task){
            System.out.println(task.getDescription());
            task.setComplete(true);
            return task;
        }

}
