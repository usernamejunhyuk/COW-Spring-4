package com.example.junhyukcrudapi.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    public void signup(@RequestBody CreateMemberRequest createMemberRequest) {
        memberService.signup(createMemberRequest);
    }
}
