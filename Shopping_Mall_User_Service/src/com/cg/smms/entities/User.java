package com.cg.smms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.cj.Query;
import com.mysql.cj.Session;

@Entity
@Table(name ="User")
public class User
{

@Id
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

private String name;

private String type;

private String password;

public String getUserid() {
	// TODO Auto-generated method stub
	return null;
}

/*public Session getCurrentSession() {
	// TODO Auto-generated method stub
	return null;
}

public Query createQuery(String string, Class<User> class1) {
	// TODO Auto-generated method stub
	return null;
}

public void setParameter(String string, String name2) {
	// TODO Auto-generated method stub
	
}

public User getSingleResult() {
	// TODO Auto-generated method stub
	return null;
}*/

}
