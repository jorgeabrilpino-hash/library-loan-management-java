package com.example.lab13.repo;

import java.util.Optional;

import com.example.lab13.model.Member;

public interface MemberRepository {
    Optional<Member> findById(String id);
    void save(Member member);
}

