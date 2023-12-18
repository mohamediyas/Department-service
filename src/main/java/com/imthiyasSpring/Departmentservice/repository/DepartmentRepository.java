package com.imthiyasSpring.Departmentservice.repository;

import com.imthiyasSpring.Departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String code);
}
