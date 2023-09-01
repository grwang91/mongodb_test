package com.example.mongodb_test.repository;

import com.example.mongodb_test.entity.TestEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestRepositoryTest {

	@Autowired
	private TestRepository testRepository;

	@Test
	void test() {
		TestEntity entity = new TestEntity();
		TestEntity saved = testRepository.save(entity);

		testRepository.findById(saved.getId());
		List<TestEntity> result = testRepository.findAllByIdGreaterThan("000000000000000000000000");

		List<TestEntity> byIdGreaterThan = testRepository.findByIdGreaterThan("000000000000000000000000");

	}
}