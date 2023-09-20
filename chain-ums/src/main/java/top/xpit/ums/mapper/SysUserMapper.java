package top.xpit.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.xpit.ums.entity.SysUser;


/**
 * (SysUser)表数据库访问层
 *
 * @author PTJ
 * @since 2023-09-17 15:37:45
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}

