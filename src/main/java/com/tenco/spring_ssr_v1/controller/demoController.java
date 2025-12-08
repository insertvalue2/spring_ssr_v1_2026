package com.tenco.spring_ssr_v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * temp - 화면 확인 용 컨트롤러(삭제할꺼야)
 */
@Controller
public class demoController {

//    user
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/join-form")
    public String joinForm(){
        return "user/join-form";
    }

    @GetMapping("/login-form")
    public String loginForm(){
        return "user/login-form";
    }

    @GetMapping("/update-form")
    public String updateForm(){
        return "user/update-form";
    }

//    board
    @GetMapping("/board/save-form")
    public String boardSaveForm(){
        return "board/save-form";
    }

    @GetMapping("/board/update-form")
    public String boardUpdateForm(){
        return "board/update-form";
    }

    @GetMapping("/board/detail/{id}")
    public String boardDetailForm(){
        return "board/detail";
    }
}
