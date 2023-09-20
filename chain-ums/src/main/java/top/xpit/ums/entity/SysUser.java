package top.xpit.ums.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import top.xpit.mybatis.base.BaseMapperEntity;

/**
 * (SysUser)表实体类
 *
 * @author PTJ
 * @since 2023-09-17 15:37:44
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class SysUser extends BaseMapperEntity {
    @TableId
    private Long id;

    
    private String username;
    
    private String nickname;




}

