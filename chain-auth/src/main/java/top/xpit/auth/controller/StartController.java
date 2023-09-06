package top.xpit.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xpit.auth.service.UmsConsumerService;

/**
 * @author PTJ
 * @date 2023/9/6 20:29
 */
@RestController
public class StartController {

    @Autowired
    private UmsConsumerService service;

    @GetMapping("start")
    public String start() {
        return "start";
    }

    @GetMapping("test")
    public String test() {
        return service.test();
    }
}
