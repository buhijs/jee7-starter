package com.realdolmen.course.controller;

import com.realdolmen.course.domain.Book;
import com.realdolmen.course.repository.PersonRepositoryRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by NQRAZ66 on 3/03/2016.
 */
@Named
@RequestScoped
public class RegistrationBean implements Serializable{

    Logger l = LoggerFactory.getLogger(getClass());

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
    PersonRepositoryRemote personRepository;

    @PostConstruct
    public void init() {
        l.info("init Properties");
        this.firstName = "Nicolas";
        this.lastName = "Quartier";
    }

    public void setL(Logger l) {
        this.l = l;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Logger getL() {
        return l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }



    public String getServiceLevel() {
        return serviceLevel;
    }
}
