package com.march.dbdemo.dao;


import com.march.dbdemo.dto.ProductDTO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public void addProduct(ProductDTO productDTO) {
        sessionFactory.getCurrentSession().saveOrUpdate(productDTO);
    }
}
