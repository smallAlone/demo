package com.zkr.demo.controller;


import com.zkr.demo.domain.dept.entity.Dept;
import com.zkr.demo.domain.dept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxy
 * @since 2021-01-25
 */
@RestController
@RequestMapping("/dept")
public class DeptController {


    @Autowired
    private IDeptService iDeptService;

    @RequestMapping("/getAllDept")
    @ResponseBody
    public List<Dept> getAllDept(){
        Map<String,Object> map = new HashMap<>();
        map.put("DNAME","ACCOUNTING");
        return iDeptService.getBaseMapper().selectByMap(map);
    }
}
