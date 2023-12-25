package com.imthiyasSpring.Departmentservice.mapper;

import com.imthiyasSpring.Departmentservice.dto.DepartmentDto;
import com.imthiyasSpring.Departmentservice.entity.Department;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department){
        DepartmentDto departmentDto = new DepartmentDto(
          department.getId(),
          department.getDepartmentName(),
          department.getDepartmentDescription(),
          department.getDepartmentCode()
        );

        return  departmentDto;
    }

    public  static  Department mapToDepartment(DepartmentDto departmentDto){
        Department department = new Department(
          departmentDto.getId() == null ? 0 : departmentDto.getId(),
          departmentDto.getDepartmentName(),
          departmentDto.getDepartmentDescription(),
          departmentDto.getDepartmentCode()
        );

        return  department;
    }

}
