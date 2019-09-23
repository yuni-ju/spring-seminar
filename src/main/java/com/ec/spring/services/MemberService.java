package com.ec.spring.services;

import models.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberService {

    private ArrayList<Member> members;

    public MemberService() {
        this.members = new ArrayList<>();
    }

    public void addMember(Member member){
        //멤버추가
        members.add(member);
    }
    public ArrayList<Member> getMembers(){
        //모든멤버반환
        return members;
    }
    public Member getMemberById(String id){
        //id를 가진 멤버 반환
        for(Member member : members){
            if(member.getId().equals(id)){
                return member;
            }
        }
        return null;
    }

    public boolean updateMember(String id, Member updateMember){
        for(Member member : members){
            if(member.getId().equals(id)){
               member.setName(updateMember.getName());
               member.setContacts(updateMember.getContacts());
               return true;
            }
        }
        return false;
    }

    public boolean deleteMember(String id){
        for(Member member : members){
            if(member.getId().equals(id)){
               members.remove(member);
                return true;
            }
        }
        return false;
    }
}
