package refactoring.kata.smell.duplicated_code;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class EmployeeFinderTest {

    @Test
    public void should_return_names() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ENGINEER", "Jason1"));
        employees.add(new Employee("ENGINEER", "Jason2"));
        employees.add(new Employee("ENGINEER", "Jason3"));
        employees.add(new Employee("ENGINEER", "Jason4"));
        employees.add(new Employee("ADMINISTRATOR", "Admin1"));
        employees.add(new Employee("ADMINISTRATOR", "Admin2"));
        employees.add(new Employee("ADMINISTRATOR", "Admin3"));
        employees.add(new Employee("ADMINISTRATOR", "Admin4"));
        employees.add(new Employee("ADMINISTRATOR", "Admin5"));

        EmployeeFinder finder = new EmployeeFinder(employees);

        assertThat(finder.findEngineerNames()).hasSize(4);
        assertThat(finder.findAdministratorNames()).hasSize(5);
    }
}
