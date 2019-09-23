package com.ec.spring.Controllers;


import models.Member;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/params")
public class ParameterController {

    //쿼리로 받는 것?
    //localhost:8080/params?query=abcabcd&page=2
    @GetMapping("/query")
    public String query(@RequestParam String query, @RequestParam int page){
        return "[Query]"+ "\n" +
                "query : " + query + "\n" +
                "page : " + page;
    }

    //path
    // /path/검색어를 입력해주세요/2
    @GetMapping("/path/{query}/{page}")
    public String path(@PathVariable String query, @PathVariable int page){
        return "[Path Variable]"+ "\n" +
                "query : " + query + "\n" +
                "page : " + page;
    }

    //body
    //
    @PostMapping("/body") //얘는 포스트매핑
    public String body(@RequestBody Member member){
        return "[Body]" + "\n" +
                "id : " + member.getId() + "\n" +
                "name : " + member.getName() + "\n" +
                "contacts : " + member.getContacts();
    }


}
