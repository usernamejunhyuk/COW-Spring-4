package com.example.junhyukcrudapi.member;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemberRepository {

    //name은 unique해야 한다.
    private final Map<String, Member> memberRepository = new ConcurrentHashMap<>();
    private static Long id = 0L;

    public void save(Member member) {
        id++;
        member = Member.builder()
                .id(id)
                .name(member.getName())
                .email(member.getEmail())
                .password(member.getPassword())
                .build();
        memberRepository.put(member.getName(), member);
    }

    public Member findByName(String name) {
        return memberRepository.get(name);
    }

    public void delete(Member member) {
        memberRepository.remove(member.getName(), member);
    }
}
