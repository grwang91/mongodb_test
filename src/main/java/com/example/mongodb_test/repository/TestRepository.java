package com.example.mongodb_test.repository;

import com.example.mongodb_test.entity.TestEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TestRepository extends MongoRepository<TestEntity, String> {

//	@Query("{'_id': {'$gte': {'$oid': ?0}}}")
	List<TestEntity> findAllByIdGreaterThan(String id);

	List<TestEntity> findByIdGreaterThan(String id);
	
}
