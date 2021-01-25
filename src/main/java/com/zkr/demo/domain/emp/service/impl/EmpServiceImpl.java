package com.zkr.demo.domain.emp.service.impl;

import com.zkr.demo.domain.emp.entity.Emp;
import com.zkr.demo.domain.emp.mapper.EmpMapper;
import com.zkr.demo.domain.emp.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxy
 * @since 2021-01-25
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
