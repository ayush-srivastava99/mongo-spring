package com.ayush.mongodemo.response;

import com.ayush.mongodemo.domain.Product;
import com.ayush.mongodemo.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private Map<String, String> tags;

    public static ProductResponse of(Product product)
    {
        return new ProductResponse(product.getId(), product.getDescription(), product.getDescription(), product.getTags());
    }

}
