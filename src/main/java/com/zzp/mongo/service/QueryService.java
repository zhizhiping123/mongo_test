package com.zzp.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mongodb.DBCursor;
import com.zzp.mongo.entity.Person;
import com.zzp.mongo.repostory.PersonRepostory;

@Service
public class QueryService {
@Autowired
private PersonRepostory personRepostory;
@Autowired
private MongoOperations operations;
public PersonRepostory getPersonRepostory() {
	return personRepostory;
}

public void setPersonRepostory(PersonRepostory personRepostory) {
	this.personRepostory = personRepostory;
}
	public List<Person> queryPersonByName(){
//		personRepostory.deleteAll();
//		Person person=new Person();
//		person.setName("zhizhiping");
//		personRepostory.save(person);
		System.out.println(operations.getCollection("stu").count());
		System.out.println(operations.findById(123, Person.class));
		DBCursor find = operations.getCollection("stu").find();
		List<Person> nameList = operations.find(Query.query(Criteria.where("name").is("zhizhiping")), Person.class);
		
		for (Person person2 : nameList) {
			System.out.println(person2);
		}
		return nameList;
	}

}
