package ridoyproject.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ridoyproject.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
