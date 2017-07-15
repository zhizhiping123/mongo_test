package com.zzp.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages={"com.zzp.mongo.repostory"} )
@ComponentScan(basePackages={"com.zzp.mongo.service"})
public class MongoConfig extends AbstractMongoConfiguration{
	
	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		
		return "zzp";
	}
	@Bean
	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient("127.0.0.1", 27017);
	}

	
	
}
