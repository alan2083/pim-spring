package com.alan.pim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yx on 17/2/5.
 */
@Controller
@RequestMapping
public class MainController {

    public static final String INDEX = "index";
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return INDEX;
    }
}
