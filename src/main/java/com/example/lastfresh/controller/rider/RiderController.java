package com.example.lastfresh.controller.rider;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/rider/*")
public class RiderController {

    @GetMapping("/riderList")
    public void riderList(){}

    @GetMapping("/riderMy")
    public void riderMy(){}

}
