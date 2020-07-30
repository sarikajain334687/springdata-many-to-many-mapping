package com.ttalks.tls.springdata.manytomanymapping.repository;

import com.ttalks.tls.springdata.manytomanymapping.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
