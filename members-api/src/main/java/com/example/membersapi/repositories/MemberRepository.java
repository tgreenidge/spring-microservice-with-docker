package com.example.membersapi.repositories;

import com.example.membersapi.models.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {
}