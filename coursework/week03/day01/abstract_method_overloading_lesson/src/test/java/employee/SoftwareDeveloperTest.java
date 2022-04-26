package employee;

import companies.Company;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.SoftwareTask;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SoftwareDeveloperTest {
    private Software_Developer software_developer;

    @BeforeEach
    public void setUp(){
        Company company = new Company();
        software_developer = new Software_Developer("John Cena", 3244543, 45000, company);

        company.getSoftwareBackLog().add(new SoftwareTask("Make me an intresting game"));
        company.getSoftwareBackLog().add(new SoftwareTask("Make me a great game"));
        company.getSoftwareBackLog().add(new SoftwareTask("Make me a good Website"));

    }

    @Test
    public void canPullTask(){
        //SoftwareTask task = this.sd.employer.getSoftwareBackLog().pop();
        software_developer.work(new SoftwareTask("Make me a new great game"));
        assertThat(software_developer.employer.getSoftwareBackLog().size()).isEqualTo(3);
    }


}
