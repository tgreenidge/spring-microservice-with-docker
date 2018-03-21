package com.example.membersapi.models;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pscu_id")
    private String pscuId;

    @Column(name = "ledger_id")
    private String ledgerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "street_address_1" )
    private String streetAddress1;

    @Column(name = "street_address_2" )
    private String streetAddress2;

    @Column(name = "city" )
    private String city;

    public Member(String pscuId,
                  String ledgerId,
                  String firstName,
                  String lastName,
                  String streetAddress1,
                  String streetAddress2,
                  String city) {
        this.pscuId = pscuId;
        this.ledgerId = ledgerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
    }

}
