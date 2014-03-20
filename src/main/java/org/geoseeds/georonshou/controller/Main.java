package org.geoseeds.georonshou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by geoalban on 19/03/2014.
 */

@Controller
public class Main {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
