package top.xpit.ums.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import top.xpit.rpc.ums.UmsRpcService;

/**
 * @author PTJ
 * @date 2023/9/6 23:57
 */
@DubboService
public class RpcServiceImpl implements UmsRpcService
{
    @Override
    public String test() {
        return "ums rpc success";
    }
}
