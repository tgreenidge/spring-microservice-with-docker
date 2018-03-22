package com.example.claimsapi.repositories;

import com.example.claimsapi.models.Claim;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClaimRepository extends CrudRepository<Claim, Long> {
}