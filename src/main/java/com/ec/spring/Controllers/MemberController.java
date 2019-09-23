package com.ec.spring.Controllers;

import com.ec.spring.services.MemberService;
import models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(method = RequestMethod.POST)
    public void addMember(@RequestBody Member member){
        memberService.addMember(member);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Member> getMembers(){
      return memberService.getMembers();
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") String id){
        return memberService.getMemberById(id);
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.PUT)
    public boolean updateMember(@PathVariable("id")String id, @RequestBody Member member){
        return memberService.updateMember(id,member);
    }
    @RequestMapping(value ="/{id}",method = RequestMethod.DELETE)
    public boolean deleteMember(@PathVariable("id")String id){
        return memberService.deleteMember(id);
    }
}
