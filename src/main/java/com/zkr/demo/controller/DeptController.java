package com.zkr.demo.controller;


import com.zkr.demo.commons.entity.ApiResponse;
import com.zkr.demo.commons.entity.ServiceException;
import com.zkr.demo.domain.dept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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

    @RequestMapping("/getAccountingDept")
    @ResponseBody
    public ApiResponse getAccountingDept(){
        Map<String,Object> map = new HashMap<>();
        map.put("DNAME","ACCOUNTING");
        return ApiResponse.success(iDeptService.getBaseMapper().selectByMap(map));
    }

    @RequestMapping("/getAllDept")
    @ResponseBody
    public ApiResponse getAllDept(){
        Map<String,Object> map = new HashMap<>();
        return ApiResponse.success(iDeptService.getBaseMapper().selectByMap(map));
    }

    @RequestMapping("/errorTest")
    @ResponseBody
    public ApiResponse errorTest(){
        try{
            int i = 10 % 0;
        }catch (Exception e){
            throw new ServiceException(100,"除法错误");
        }

        return ApiResponse.success();
    }

    @RequestMapping("/errorServiceTest")
    @ResponseBody
    public ApiResponse errorServiceTest(){
        return ApiResponse.success(iDeptService.getDeptById());
    }

}
