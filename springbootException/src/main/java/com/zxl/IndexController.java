package com.zxl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @RequestMapping(value = "/index/{number}")
    public String index(@PathVariable int number) {
        System.out.println(20 / number);
        return "get index page successfully.";
    }

    @RequestMapping(value = "/index2")
    public String index2() {
        if (1 == 1) {
            throw new BusinessException(400,"酷酷酷");
        }
        return "get index page successfully.";
    }
}
