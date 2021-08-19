package org.wangjstu.meeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wangjstu.meeting.model.Department;
import org.wangjstu.meeting.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/getdepbyid")
    public String getDepById(Integer id) {
        Department department = departmentService.getDepById(id);
        System.out.println(department);
        return String.valueOf(department);
    }
    
}
