package cn.itcast.test;

import cn.itcast.domain.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPADemo01 {
    @Test
    //保存用户
    public void fun1() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        //---------------------------------------------------------
        //创建一个客户对象
        Customer customer = new Customer();
        customer.setCust_name("梁晓周");
        customer.setCust_id(1000L);
        entityManager.persist(customer);
        //-----------------
        tx.commit();
        entityManager.close();
    }
}
