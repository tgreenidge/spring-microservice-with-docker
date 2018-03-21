package com.example.membersapi.controllers;

import com.example.membersapi.models.Member;
import com.example.membersapi.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MembersController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/members")
    public Iterable<Member> findAllMembers() {
        return memberRepository.findAll();
    }
}
