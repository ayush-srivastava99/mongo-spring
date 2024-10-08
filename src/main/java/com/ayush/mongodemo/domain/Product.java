package com.ayush.mongodemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("Product")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private Map<String, String> tags;
}
