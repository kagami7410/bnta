package companies;

import employee.Employee;
import tasks.ArchitectualTask;
import tasks.EngineeringTask;
import tasks.SoftwareTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Company {
    //subsitution principle
    List<Employee> employees;
    protected LinkedList<SoftwareTask> softwareBackLog = new LinkedList<>();
    protected LinkedList<EngineeringTask> engineeringBackLog = new LinkedList<>();
    protected LinkedList<ArchitectualTask> architectualBackLog = new LinkedList<>();

    public LinkedList<SoftwareTask> getSoftwareBackLog() {
        return softwareBackLog;
    }

    public LinkedList<EngineeringTask> getEngineeringBackLog() {
        return engineeringBackLog;
    }

    public LinkedList<ArchitectualTask> getArchitectualBackLog() {
        return architectualBackLog;
    }

    public Company(){
        employees = new ArrayList<>();

    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}
