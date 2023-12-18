package com.imthiyasSpring.Departmentservice.service;

import com.imthiyasSpring.Departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto  departmentDto);

    DepartmentDto getDepartmentByCode(String departmentCode);
}

//department service