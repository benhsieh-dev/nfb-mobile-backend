package com.nfb.mobile.backend.dao;

import com.nfb.mobile.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
//@CrossOrigin(origins = {"http://localhost:4200", "ionic://localhost", "http://localhost", "capacitor://localhost", "http://localhost:8100", "http://localhost:8101", "http://localhost:8102"})
//@CrossOrigin (origins = {"http://localhost:8100", "http://localhost:8101", "http://localhost:8102", "capacitor://localhost", "ionic://localhost"})
//@CrossOrigin("capacitor//localhost")
//@CrossOrigin("http//localhost")
//@CrossOrigin("capacitor://localhost")
//@CrossOrigin("http//localhost:4200")
//@CrossOrigin("http//localhost:8100")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
