package com.example.lab13.repo.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.example.lab13.model.Member;
import com.example.lab13.repo.MemberRepository;

public class InMemoryMemberRepository implements MemberRepository {
    private final Map<String, Member> data = new HashMap<>();

    @Override
    public Optional<Member> findById(String id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public void save(Member member) {
        data.put(member.getId(), member);
    }
}
