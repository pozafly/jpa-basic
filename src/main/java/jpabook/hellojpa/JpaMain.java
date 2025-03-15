// package jpabook.hellojpa;
//
// import jakarta.persistence.EntityManager;
// import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.EntityTransaction;
// import jakarta.persistence.Persistence;
//
// public class JpaMain {
//
//     public static void main(String[] args) {
//
//         EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//         EntityManager em = emf.createEntityManager();
//         // code
//         EntityTransaction tx = em.getTransaction();
//         tx.begin();
//
//         try {
//             // Member member = new Member();
//             // member.setName("hello");
//             // member.setHomeAddress(new Address("city", "street", "zipcode"));
//             // member.setWorkPeriod(new Period());
//
//             // em.persist(member);
//
//             // JPQL
//             // List<Member> result = em.createQuery(
//             //         "select m from Member m where m.name like '%kim%'",
//             //         Member.class
//             // ).getResultList();
//             //
//             // for (Member member : result) {
//             //     System.out.println(member);
//             // }
//
//             tx.commit();
//         } catch (Exception e) {
//             tx.rollback();
//         } finally {
//             em.close();
//         }
//
//         emf.close();
//     }
// }
