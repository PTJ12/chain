package top.xpit.auth.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xpit.auth.service.UmsConsumerService;
import top.xpit.rpc.ums.UmsRpcService;

/**
 * @author PTJ
 * @date 2023/9/7 0:05
 */
@Service
public class UmsConsumerServiceImpl implements UmsConsumerService {

    @DubboReference
    private UmsRpcService umsRpcService;

    public String test() {
        return umsRpcService.test();
    }
}
