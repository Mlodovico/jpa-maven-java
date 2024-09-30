package com.educandoweb.aplicativo;

import com.educandoweb.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Murilo Lodovico", "ml@john.com.br");
        Pessoa p2 = new Pessoa("Carlos Eduardo dos Santos", "carlos73@yahoo.com.br");
        Pessoa p3 = new Pessoa("Samara Hilston", "samisHihi@outlook.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);

        System.out.println(p);

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Salvo com sucesso");

        em.close();
        emf.close();
    }
}