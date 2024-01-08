package com.imthiyasSpring.Departmentservice.controller;


import com.imthiyasSpring.Departmentservice.dto.DepartmentDto;
import com.imthiyasSpring.Departmentservice.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Department controller",
        description = "Department controller expose endpoint for department service"
)
@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;


//    save department
    @Operation(
            summary = "Save Department Rest api",
            description = "save department to store department data"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http status 201 created"
    )
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto departmentDto1 = departmentService.saveDepartment(departmentDto);

        return  new ResponseEntity<>(departmentDto1, HttpStatus.CREATED);
    }

//    get by id

    @Operation(
            summary = "Get Department Rest api",
            description = "Get department to view department data"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 retrived"
    )
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode){
       DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);

       return  new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }



}
