import companies.Company;
import employee.Architech;
import employee.Employee;
import employee.Engineer;
import employee.Software_Developer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CompanyTest {
    private Company company;
    private Company company1;
    private Software_Developer dev1;



    @BeforeEach
    public void setUp() {
        company = new Company();
        company1 = new Company();
        dev1 = new Software_Developer("John Doe", 18034, 40000, company);
        company.addEmployee(dev1);
        company.addEmployee(new Engineer("Rock", 18748, 39000, company));
        company.addEmployee(new Software_Developer("Micky", 18294, 34000, company));


    }


    @Test
    public void addEmployees(){
        assertThat(company.getEmployees().size()).isEqualTo(3);
    }



}
