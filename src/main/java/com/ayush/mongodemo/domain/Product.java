package com.ayush.mongodemo.domain;

import com.ayush.mongodemo.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.time.Clock;
import java.util.Date;
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
    private Date timestamp;

    public static Product of(ProductDTO productDTO)
    {
        return Product.builder().name(productDTO.getName()).description(productDTO.getDescription()).tags(productDTO.getTags()).timestamp(Date.from(Clock.systemUTC().instant())).build();
    }
}
