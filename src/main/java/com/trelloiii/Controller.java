package com.trelloiii;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/all")
    public String getAll(){
        return "Its see all";
    }
    @RequestMapping("/admin/user")
    @PreAuthorize("hasRole('USER')")
    public String getUser(){
        return "It see user";
    }
}
