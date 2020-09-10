package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACTS_DTLS")
public class ContactsEntity {

	@Id
	@Column(name="C_ID")
	@GeneratedValue
    private Integer cid;
	@Column(name="C_NAME")
    private String cname;
	@Column(name="C_NUMBER")
    private Long cnumber;
	@Column(name="C_EMAIL")
    private String email;
	
}
