package top.xpit.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xpit.ums.entity.SysUser;
import top.xpit.ums.service.SysUserService;

import java.util.List;

/**
 * @author PTJ
 * @date 2023/9/17 15:39
 */
@RestController
@RequestMapping("sysuser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("list")
    public List<SysUser> list() {
        return sysUserService.list();
    }

    @GetMapping("transaction")
    public String testTransaction() {
        return sysUserService.testTransaction();
    }
}
