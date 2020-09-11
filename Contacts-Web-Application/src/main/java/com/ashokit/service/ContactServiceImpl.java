package com.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.ContactsEntity;
import com.ashokit.model.Contact;
import com.ashokit.persistance.Contactrepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	Contactrepository cntcrepo;
	
	@Override
	public boolean addNewContact(Contact cpojo) {
		ContactsEntity centity=new ContactsEntity();
		BeanUtils.copyProperties(cpojo, centity);
		ContactsEntity entity = cntcrepo.save(centity);
		return entity.getCid()!=null;
	}

	@Override
	public List<ContactsEntity> getAllContacts() {
		List<ContactsEntity> list = cntcrepo.findAll();
		return list;
	}

	@Override
	public ContactsEntity getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(ContactsEntity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
