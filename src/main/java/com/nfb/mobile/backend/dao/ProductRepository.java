package com.nfb.mobile.backend.dao;

import com.nfb.mobile.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
