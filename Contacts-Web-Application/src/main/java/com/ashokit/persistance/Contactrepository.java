package com.ashokit.persistance;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.ContactsEntity;

public interface Contactrepository extends JpaRepository<ContactsEntity, Serializable> {

}
