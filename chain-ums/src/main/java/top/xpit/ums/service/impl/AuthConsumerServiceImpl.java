package top.xpit.ums.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import top.xpit.rpc.auth.AuthRpcService;
import top.xpit.ums.service.AuthConsumerService;

/**
 * @author PTJ
 * @date 2023/9/7 0:05
 */
@Service
public class AuthConsumerServiceImpl implements AuthConsumerService {

    @DubboReference
    private AuthRpcService authRpcService;

    public String test() {
        return authRpcService.test();
    }
}
