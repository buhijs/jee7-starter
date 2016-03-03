package com.realdolmen.course.controller;

import com.realdolmen.course.domain.Person;
import com.realdolmen.course.repository.PersonRepositoryBean;
import com.realdolmen.course.repository.PersonRepositoryRemote;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class PersonController implements Serializable{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String serviceLevel;
    private String bookTitle;
    private String phoneNr;
    private String accountNr;

    @Inject
    PersonRepositoryBean personRepository;


    private Person p = new Person();

    public String savePerson() {
        p.setLastName(lastName);
        p.setFirstName(firstName);
        System.out.println("try to save p");
        personRepository.save(p);
        return "index.xhtml";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }
}
