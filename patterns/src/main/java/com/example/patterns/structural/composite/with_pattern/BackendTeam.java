package com.example.patterns.structural.composite.with_pattern;

import java.util.ArrayList;
import java.util.List;

public class BackendTeam implements Team {

    List<Member> members = new ArrayList<>();

    @Override
    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public void removeMember(int id) {
        if (id < members.size()) {
            members.remove(id);
        }
    }

    @Override
    public void createProject() {
        members.forEach(Member::work);
    }
}
