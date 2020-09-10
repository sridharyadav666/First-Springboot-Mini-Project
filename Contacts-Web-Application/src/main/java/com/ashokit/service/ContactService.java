package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.ContactsEntity;


public interface ContactService {

	
	public boolean addNewContact(ContactsEntity entity);
	public List<ContactsEntity> getAllContacts();
	public ContactsEntity getContactById(Integer cid);
	public boolean updateContact(ContactsEntity entity);
	public boolean deleteContact(Integer cid);
	
}
