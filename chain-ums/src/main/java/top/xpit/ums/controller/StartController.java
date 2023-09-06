package top.xpit.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xpit.rpc.auth.AuthRpcService;
import top.xpit.ums.service.AuthConsumerService;

/**
 * @author PTJ
 * @date 2023/9/6 20:29
 */
@RestController
public class StartController {

    @Autowired
    private AuthConsumerService service;

    @GetMapping("start")
    public String start() {
        return "start";
    }

    @GetMapping("test")
    public String test() {
        return service.test();
    }
}
