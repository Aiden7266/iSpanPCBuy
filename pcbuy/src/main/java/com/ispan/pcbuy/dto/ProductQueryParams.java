package com.ispan.pcbuy.dto;

import com.ispan.pcbuy.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {

    private ProductCategory category;
    private String search;
}
