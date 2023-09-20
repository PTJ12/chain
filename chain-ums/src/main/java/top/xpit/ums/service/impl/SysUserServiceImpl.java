package top.xpit.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import top.xpit.ums.entity.SysUser;
import top.xpit.ums.mapper.SysUserMapper;
import top.xpit.ums.service.SysUserService;

/**
 * (SysUser)表服务实现类
 *
 * @author PTJ
 * @since 2023-09-17 15:37:46
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {


    @GlobalTransactional(rollbackFor = Exception.class)
    @Override
    public String testTransaction() {
        SysUser sysUser = new SysUser();
        sysUser.setId(3L);
        sysUser.setUsername("test");
        sysUser.setNickname("test");
        baseMapper.insert(sysUser);
        Integer m = 1 / 0;
        return "success";
    }
}

