package com.kh.myproduct.myproduct.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@Slf4j
@SpringBootTest
public class ProductDAOTest {

  @Autowired
  ProductDAO productDAO;

  @Test
  void save(){
    Product product = new Product();
    product.setPname("복사기");
    product.setQuantity(10L);
    product.setPrice(10000L);

    Long productId = productDAO.save(product);
    log.info("productId={}",productId);
//    Optional<Product> findedProduct = productDAO.findById(productId);
//    log.info("findedProduct={}",findedProduct);
  }

  //조회
  @Test
  void findById(){
    Long productId = 44L;
    Optional<Product> product = productDAO.findById(productId);
    if (product.isPresent()){
      log.info("product={}",product.get());
    }else {
      log.info("조회결과 없음");
    }
  }
}
