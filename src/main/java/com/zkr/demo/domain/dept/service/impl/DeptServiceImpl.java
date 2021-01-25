package com.zkr.demo.domain.dept.service.impl;

import com.zkr.demo.domain.dept.entity.Dept;
import com.zkr.demo.domain.dept.mapper.DeptMapper;
import com.zkr.demo.domain.dept.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
