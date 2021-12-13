package com.nfb.mobile.backend.dao;

import com.nfb.mobile.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin
@CrossOrigin(origins = {"http://localhost (Android)", "capacitor://localhost (iOS)", "http://localhost:8102"})
//@CrossOrigin (origins = {"http://localhost:8100", "http://localhost:8101", "http://localhost:8102", "capacitor://localhost", "ionic://localhost"})
public interface ProductRepository extends JpaRepository<Product, Long> {
}
