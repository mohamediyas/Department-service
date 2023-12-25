package com.imthiyasSpring.Departmentservice.service.impl;

import com.imthiyasSpring.Departmentservice.dto.DepartmentDto;
import com.imthiyasSpring.Departmentservice.entity.Department;
import com.imthiyasSpring.Departmentservice.mapper.DepartmentMapper;
import com.imthiyasSpring.Departmentservice.repository.DepartmentRepository;
import com.imthiyasSpring.Departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImple implements DepartmentService {


    private DepartmentRepository departmentRepository;


    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

//        convert to dto to department

//        Department department = new Department(
//                departmentDto.getId() == null ? 0 : departmentDto.getId(),
//                departmentDto.getDepartmentName(),
//                departmentDto.getDepartmentDescription(),
//                departmentDto.getDepartmentCode()
//        );

        Department department = DepartmentMapper.mapToDepartment(departmentDto);

       Department savedDepartment =  departmentRepository.save(department);

//       DepartmentDto departmentDto1 = new DepartmentDto(
//               savedDepartment.getId(),
//               savedDepartment.getDepartmentName(),
//               savedDepartment.getDepartmentDescription(),
//               savedDepartment.getDepartmentCode()
//       );

        DepartmentDto departmentDto1 = DepartmentMapper.mapToDepartmentDto(savedDepartment);


        return departmentDto1;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        System.out.println(department);


//        DepartmentDto departmentDto = new DepartmentDto(
//                department.getId(),
//                department.getDepartmentName(),
//                department.getDepartmentDescription(),
//                department.getDepartmentCode()
//        );

        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

        return departmentDto;
    }
}
