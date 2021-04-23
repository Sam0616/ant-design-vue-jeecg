package org.jeecg.modules.system.service.impl;

import org.jeecg.modules.system.entity.MyStudent;
import org.jeecg.modules.system.mapper.MyStudentMapper;
import org.jeecg.modules.system.service.IMyStudentService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 学生表
 * @Author: jeecg-boot
 * @Date:   2021-04-23
 * @Version: V1.0
 */
@Service
public class MyStudentServiceImpl extends ServiceImpl<MyStudentMapper, MyStudent> implements IMyStudentService {

}
