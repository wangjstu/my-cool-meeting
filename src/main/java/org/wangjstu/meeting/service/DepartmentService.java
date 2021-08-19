package org.wangjstu.meeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wangjstu.meeting.mapper.DepartmentMapper;
import org.wangjstu.meeting.model.Department;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {
        return departmentMapper.getDepById(id);
    }
}
