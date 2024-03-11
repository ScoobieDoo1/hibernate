package com.march.dbdemo.service;

import com.march.dbdemo.dao.ProductDAOImpl;
import com.march.dbdemo.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDAOImpl productDAOImpl;

    public void addProduct(String productId, String productName) {
        ProductDTO productDTO = new ProductDTO();
        //productDTO.setId(1L);
        productDTO.setProductId(productId);
        productDTO.setProductName(productName);
        productDAOImpl.addProduct(productDTO);
    }
}
