package com.bridgelabz.employeepayrollapp.controler;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ReasponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ReasponseDTO> getEmployeePayrollData(){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("sukumar", 20000));
        ReasponseDTO reasponseDTO = new ReasponseDTO("get call success", employeePayrollData);
        return new ResponseEntity<ReasponseDTO>(reasponseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ReasponseDTO> getEmployeePayrollData(@PathVariable ("empId") int empId){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("sukumar", 20000));
        ReasponseDTO reasponseDTO = new ReasponseDTO("get call for id success", employeePayrollData);
        return new ResponseEntity<ReasponseDTO>(reasponseDTO, HttpStatus.OK);
    }

    /*@GetMapping("/get")
    public ResponseEntity<ReasponseDTO> getEmployeePayrollDataUsingParam(@RequestParam ("empId") int empId){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("sukumar", 20000));
        ReasponseDTO reasponseDTO = new ReasponseDTO("get call for id success", employeePayrollData);
        return new ResponseEntity<ReasponseDTO>(reasponseDTO, HttpStatus.OK);
    }*/

    @PostMapping("/create")
    public ResponseEntity<ReasponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(2, employeePayrollDTO);
        ReasponseDTO reasponseDTO = new ReasponseDTO("created employee data sucessfully", employeePayrollData);
        return new ResponseEntity<ReasponseDTO>(reasponseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ReasponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        ReasponseDTO reasponseDTO = new ReasponseDTO("updated employee payroll data successfully", employeePayrollData);
        return new ResponseEntity<ReasponseDTO>(reasponseDTO, HttpStatus.OK);
    }

    @DeleteMapping("delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        ReasponseDTO reasponseDTO = new ReasponseDTO("deleted sucessfully, deleted id:", empId);
        return new ResponseEntity<String>("Deleted employee payroll data", HttpStatus.OK);
    }
}