// package jpabook.hellojpa;
//
// import jakarta.persistence.*;
//
// @Entity
// public class Member {
//
//     @Id
//     @GeneratedValue
//     @Column(name = "MEMBER_ID")
//     private Long id;
//
//     @Column(name = "USERNAME")
//     private String name;
//
//     // @Column(name = "TEAM_ID")
//     // private Long teamId;
//
//     @ManyToOne
//     @JoinColumn(name = "TEAM_ID")
//     private Team team;
//
//     public Long getId() {
//         return id;
//     }
//
//     public void setId(Long id) {
//         this.id = id;
//     }
//
//     public String getName() {
//         return name;
//     }
//
//     public void setName(String name) {
//         this.name = name;
//     }
//
//     public Team getTeam() {
//         return team;
//     }
//
//     public void changeTeam(Team team) {
//         this.team = team;
//         team.getMembers().add(this);
//     }
// }
