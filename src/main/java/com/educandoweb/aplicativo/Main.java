package com.educandoweb.aplicativo;

import com.educandoweb.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(2123, "Murilo Lodovico", "ml@john.com.br");
        Pessoa p2 = new Pessoa(1231, "Carlos Eduardo dos Santos", "carlos73@yahoo.com.br");
        Pessoa p3 = new Pessoa(1432, "Samara Hilston", "samisHihi@outlook.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();



    }
}