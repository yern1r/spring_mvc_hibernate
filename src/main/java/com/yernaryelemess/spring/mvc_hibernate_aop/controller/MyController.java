package com.yernaryelemess.spring.mvc_hibernate_aop.controller;

import com.yernaryelemess.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.yernaryelemess.spring.mvc_hibernate_aop.entity.Employee;
import com.yernaryelemess.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){


        List<Employee> allEmployee = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployee);

        return "all-employees";
    }

}
