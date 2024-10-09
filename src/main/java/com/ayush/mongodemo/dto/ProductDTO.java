package com.ayush.mongodemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    @JsonProperty
    String name;
    @JsonProperty
    String description;
    @JsonProperty
    Map<String, String> tags;
}
