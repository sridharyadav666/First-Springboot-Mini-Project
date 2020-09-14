package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.ContactsEntity;
import com.ashokit.model.Contact;


public interface ContactService {

	
	public boolean addNewContact(Contact cpojo);
	public List<Contact> getAllContacts();
	public Contact getContactById(Integer cid);
	public boolean updateContact(ContactsEntity entity);
	public boolean deleteContact(Integer cid);
	
}
