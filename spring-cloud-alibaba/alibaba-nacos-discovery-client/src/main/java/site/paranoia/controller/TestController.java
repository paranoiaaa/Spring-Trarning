package site.paranoia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Paranoia on 2019-08-12 人间不值得
 **/
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    TestClient testClient;

    @GetMapping()
    public String test() {
        String result = testClient.test("Hello Nacos");
        return "Return : " + result;
    }
}
