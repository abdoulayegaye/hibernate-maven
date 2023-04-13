package sn.groupeisi.presentation;

import sn.groupeisi.entity.Employe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try{
            //Début de transaction
            transaction.begin();
            Employe employe = new Employe();
            employe.setNomE("GUEYE");
            employe.setPrenomE("Adama");
            employe.setSalaireE(900000);
            employe.setIdDepartement(2);
            //Persister ou sauvegarder dans la BDD
            entityManager.persist(employe);
            //Validation de la transaction
            transaction.commit();
        }finally {
            if(transaction.isActive())
                transaction.rollback();
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
