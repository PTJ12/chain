package top.xpit.auth.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import top.xpit.rpc.auth.AuthRpcService;

/**
 * @author PTJ
 * @date 2023/9/6 23:57
 */
@DubboService
public class RpcServiceImpl implements AuthRpcService
{
    @Override
    public String test() {
        return "auth rpc success";
    }
}
