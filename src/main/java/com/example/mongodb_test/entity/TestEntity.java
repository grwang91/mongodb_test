package com.example.mongodb_test.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("test_entity")
public class TestEntity {
	@MongoId(targetType = FieldType.OBJECT_ID)
	private String id;

	private String testField;

	public String getId() {
		return id;
	}
}
