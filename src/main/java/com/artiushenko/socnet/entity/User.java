package com.artiushenko.socnet.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class User extends AbstractPersistable<Long> {

    @Column(length = 120, name = "user_name")
    private String userName;

    @Column(length = 120, name = "surname")
    private String surname;

    @Column(length = 120, name = "login")
    private String login;

    @Column(length = 120, name = "passwrd")
    private String passwrd;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(length = 255, name = "friend_list")
    private String friend_list;

    @ManyToOne(/*cascade = CascadeType.ALL fetch = FetchType.LAZY*/)
    @JoinColumn(name="fc_town")
    private Town town;

    @ManyToOne(/*cascade = CascadeType.ALL fetch = FetchType.LAZY*/)
    @JoinColumn(name="fc_school")
    private School school;

    @ManyToOne(/*cascade = CascadeType.ALL fetch = FetchType.LAZY*/)
    @JoinColumn(name="fc_family_status")
    private FamilyStatus familyStatus;

    @ManyToOne(/*cascade = CascadeType.ALL fetch = FetchType.LAZY*/)
    @JoinColumn(name="fc_education")
    private Education education;
}
