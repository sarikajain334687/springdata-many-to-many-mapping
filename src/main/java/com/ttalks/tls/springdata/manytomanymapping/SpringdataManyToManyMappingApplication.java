package com.ttalks.tls.springdata.manytomanymapping;

import com.ttalks.tls.springdata.manytomanymapping.entity.Employee;
import com.ttalks.tls.springdata.manytomanymapping.entity.Task;
import com.ttalks.tls.springdata.manytomanymapping.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringdataManyToManyMappingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataManyToManyMappingApplication.class, args);
    }
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee emp = new Employee("Employee1", "Employeerole1");
        Employee emp1 = new Employee("Employee2", "Employeerole2");

        Task task = new Task("task1");
        Task task2 = new Task("task2");

        emp.getTasks().add(task);
        emp.getTasks().add(task2);

        task.getEmployee().add(emp);
        task2.getEmployee().add(emp);

        task.getEmployee().add(emp1);

        emp1.getTasks().add(task);

        employeeRepository.save(emp);
        employeeRepository.save(emp1);

    }
}
