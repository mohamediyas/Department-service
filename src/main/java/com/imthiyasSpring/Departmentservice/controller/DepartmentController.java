package com.imthiyasSpring.Departmentservice.controller;


import com.imthiyasSpring.Departmentservice.dto.DepartmentDto;
import com.imthiyasSpring.Departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;


//    save department
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto departmentDto1 = departmentService.saveDepartment(departmentDto);

        return  new ResponseEntity<>(departmentDto1, HttpStatus.CREATED);
    }

//    get by id

    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode){
       DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);

       return  new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }



}
