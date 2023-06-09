package com.kh.myproduct.myproduct.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
  private Long productId;   // PRODUCT_ID	NUMBER(10,0)
  private String pname;     // PNAME	VARCHAR2(30 BYTE)
  private Long quantity;    // QUANTITY	NUMBER(10,0)
  private Long price;       // PRICE	NUMBER(10,0)
}
