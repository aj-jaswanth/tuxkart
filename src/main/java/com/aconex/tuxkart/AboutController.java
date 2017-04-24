package com.aconex.tuxkart;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @RequestMapping(method = RequestMethod.GET, path = "/about", produces = MediaType.TEXT_PLAIN_VALUE)
    public String about() {
        return "TuxKart";
    }
}
