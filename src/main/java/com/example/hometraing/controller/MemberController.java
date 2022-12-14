package com.example.hometraing.controller;

import com.example.hometraing.controller.request.MemberRequestDto;
import com.example.hometraing.controller.response.ResponseDto;
import com.example.hometraing.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController // 프른트랑 잇게 될 경우에 Controller로 바꿔야 될 수 있어서 추후 상황 파악 필요
@RequestMapping("/public/member")
public class MemberController {

    private final MemberService memberService;

    // 회원가입
    @PostMapping("/signup")
    public ResponseDto<?> memberRegist(@RequestBody MemberRequestDto memberRequestDto){
        return memberService.memberRegist(memberRequestDto);
    }

}
