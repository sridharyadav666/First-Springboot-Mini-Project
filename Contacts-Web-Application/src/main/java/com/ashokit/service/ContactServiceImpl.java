package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	public List<Contact> getAllContacts() {
		List<Contact> clist=new ArrayList<Contact>();
	    List<ContactsEntity> list = cntcrepo.findAll();
		for (ContactsEntity contact : list) {
			Contact c=new Contact();
		BeanUtils.copyProperties(contact, c);
			clist.add(c);
		}
		return clist;
	}

	@Override
	public Contact getContactById(Integer cid) {
		Optional<ContactsEntity> optional = cntcrepo.findById(cid);
		Contact cont=new Contact();
		if(optional.isPresent()) {
			ContactsEntity entity = optional.get();
			BeanUtils.copyProperties(entity, cont);
		}
		return cont;
	}

	@Override
	public boolean updateContact(ContactsEntity entity) {
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		cntcrepo.deleteById(cid);
		return true;
	}

}
