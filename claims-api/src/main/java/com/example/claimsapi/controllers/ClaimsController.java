package com.example.claimsapi.controllers;

import com.example.claimsapi.models.Claim;
import com.example.claimsapi.repositories.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClaimsController {
    @Autowired
    private ClaimRepository claimRepository;

    @GetMapping("/claims")
    public Iterable<Claim> findAllClaims() {
        return claimRepository.findAll();
    }

    @GetMapping("/claims/{claimId}")
    public Claim findClaimById(@PathVariable Long claimId) {
        return claimRepository.findOne(claimId);
    }

    @DeleteMapping("/claims/{claimId}")
    public HttpStatus deleteClaimById(@PathVariable Long claimId) {
        claimRepository.delete(claimId);
        return HttpStatus.OK;
    }

    @PostMapping("/members")
    public HttpStatus createNewClaim(@RequestBody Claim newClaim) {
        claimRepository.save(newClaim);
        return HttpStatus.OK;
    }
}
