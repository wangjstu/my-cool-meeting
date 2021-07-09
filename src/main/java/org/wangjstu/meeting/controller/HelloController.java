package org.wangjstu.meeting.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjstu
 */

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello()
    {
        return "hello";
    }
}
