package com.zkr.demo.domain.dept.service.impl;

import com.zkr.demo.commons.entity.ServiceException;
import com.zkr.demo.domain.dept.entity.Dept;
import com.zkr.demo.domain.dept.mapper.DeptMapper;
import com.zkr.demo.domain.dept.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxy
 * @since 2021-01-25
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

    public Dept getDeptById(){
        Dept dept = null;
        if(Objects.isNull(dept)){
            throw new ServiceException(100,"查询员工为空");
        }
        return dept;
    }
}
