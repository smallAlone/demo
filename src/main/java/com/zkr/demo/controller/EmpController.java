package com.zkr.demo.controller;


import com.zkr.demo.domain.emp.entity.Emp;
import com.zkr.demo.domain.emp.service.impl.EmpServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxy
 * @since 2021-01-25
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    private EmpServiceImpl empService;
    @RequestMapping("/test")
    public Emp test(){
        return null;
    }
}
