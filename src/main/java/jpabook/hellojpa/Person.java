package jpabook.hellojpa;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long id;

    @Column(name = "USER_NAME")
    private String username;

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;
}
