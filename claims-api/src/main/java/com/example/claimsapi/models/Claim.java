package com.example.claimsapi.models;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "claims")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ledger_id")
    private String ledgerId;

    @Column(name = "pscu_id")
    private String pscuId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="amount")
    private Double amount;

    @Column(name="claim_type")
    private String claimType;

    @Column(name="date_submitted")
    private Date dateSubmitted;

    @Column(name="date_approved")
    private Date dateApproved;

    public Claim(
                String ledgerId,
                String pscuId,
                String firstName,
                String lastName,
                Double amount,
                String claimType,
                Date dateSubmitted,
                Date dateApproved
                ) {
        this.pscuId = pscuId;
        this.ledgerId = ledgerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
        this.claimType = claimType;
        this.dateApproved = dateApproved;
        this.dateSubmitted = dateSubmitted;

    }

}
