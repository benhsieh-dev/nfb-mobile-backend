package com.nfb.mobile.backend.dao;

import com.nfb.mobile.backend.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


//@CrossOrigin("http://localhost:8102")
@CrossOrigin
//@CrossOrigin("http://localhost")
//@CrossOrigin("capacitor://localhost")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
