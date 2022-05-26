package co.zhoujc.controller;

import co.zhoujc.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private MsgService msgService;

    @GetMapping
    public String get(@PathVariable String tele) {
        return msgService.get(tele);
    }

    @PostMapping
    public boolean check(String tele, String code) {
        return msgService.check(tele, code);
    }
}
