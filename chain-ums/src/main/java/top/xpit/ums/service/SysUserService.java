package top.xpit.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.xpit.ums.entity.SysUser;


/**
 * (SysUser)表服务接口
 *
 * @author PTJ
 * @since 2023-09-17 15:37:46
 */
public interface SysUserService extends IService<SysUser> {

    String testTransaction();
}

