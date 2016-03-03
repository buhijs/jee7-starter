package com.realdolmen.course.repository;

import com.realdolmen.course.domain.Person;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Named
@RequestScoped
public class PersonRepositoryBean implements PersonRepositoryRemote {
    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public Person save(Person person) {
        em.persist(person);
        return person;
    }

    @Override
    public Person findById(Long id) {
        return em.find(Person.class, id);
    }

    @Override
    public List<Person> findAll() {
        return em.createQuery("select p from Person p", Person.class).getResultList();
    }

}
