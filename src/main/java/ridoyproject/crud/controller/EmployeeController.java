package ridoyproject.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ridoyproject.crud.model.Employee;
import ridoyproject.crud.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  private EmployeeRepository employeeRepository;

  @PostMapping(value = "/save")
  public @ResponseBody ResponseEntity<?> save(@RequestBody Employee employee) {
    return new ResponseEntity<>(this.employeeRepository.save(employee), HttpStatus.OK);
  }

  @PutMapping(value = "/update")
  public @ResponseBody
  ResponseEntity<?> update(@RequestParam Long id,
                           @RequestBody Employee employee) {
    return new ResponseEntity<>(this.employeeRepository.save(employee), HttpStatus.OK);
  }

  @DeleteMapping(value = "/delete")
  public @ResponseBody
  ResponseEntity<?> delete(@RequestParam Long id) {
    this.employeeRepository.delete(new Employee(id));
    return new ResponseEntity<>("success", HttpStatus.OK);
  }

  @GetMapping(value = "/search")
  public @ResponseBody
  ResponseEntity<?> search() {
    return new ResponseEntity<>(this.employeeRepository.findAll(), HttpStatus.OK);
  }

}
