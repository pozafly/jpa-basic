package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpabook.jpashop.domain.*;

import java.time.ZoneId;
import java.util.Date;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        // code
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setName("황선태");
            member.setCity("서울");
            member.setStreet("송파");
            member.setZipcode("56653");
            em.persist(member);

            Member member2 = new Member();
            member2.setName("황선태2");
            member2.setCity("서울2");
            member2.setStreet("송파2");
            member2.setZipcode("56653");
            em.persist(member2);

            em.flush();
            em.clear();

            Order order = new Order();
            order.setMember(member);
            order.setOrderDate(new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
            order.setStatus(OrderStatus.ORDER);
            em.persist(order);

            Item item = new Item();
            item.setName("양말");
            item.setStockQuantity(10);
            item.setPrice(2000);
            em.persist(item);
            Item item2 = new Item();
            item2.setName("햄버거");
            item2.setStockQuantity(22);
            item2.setPrice(4000);
            em.persist(item2);
            Item item3 = new Item();
            item3.setName("콜라");
            item3.setStockQuantity(42);
            item3.setPrice(1000);
            em.persist(item3);

            OrderItem orderItem = new OrderItem();
            orderItem.setCount(2);
            orderItem.setOrderPrice(400);
            orderItem.setOrder(order);
            orderItem.setItem(item);
            em.persist(orderItem);
            OrderItem orderItem2 = new OrderItem();
            orderItem2.setCount(6);
            orderItem2.setOrderPrice(5400);
            orderItem2.setOrder(order);
            orderItem2.setItem(item2);
            em.persist(orderItem2);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
