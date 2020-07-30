package com.ttalks.tls.springdata.manytomanymapping.repository;

import com.ttalks.tls.springdata.manytomanymapping.entity.Employee;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long> {
}
