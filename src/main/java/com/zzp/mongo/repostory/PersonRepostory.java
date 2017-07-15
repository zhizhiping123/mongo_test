package com.zzp.mongo.repostory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zzp.mongo.entity.Person;

public interface PersonRepostory extends CrudRepository<Person, Long>{
	List<Person> findByName(String name);
	
}
