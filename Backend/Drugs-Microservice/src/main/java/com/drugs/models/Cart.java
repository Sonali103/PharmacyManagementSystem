package com.drugs.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data

@Document(collection = "cart")
public class Cart {

  @Id
  private String cartId;

  private String username;

  private String drugsId;

  private String drugsName;

  private double drugsCost;

  private int drugsQty;

  private int stockQty;

  private String drugsDescription;

  private double total;

  /**
   * @return cartId
   */
  public String getCartId() {

    return this.cartId;
  }

  /**
   * @param cartId new value of {@link #getcartId}.
   */
  public void setCartId(String cartId) {

    this.cartId = cartId;
  }

  /**
   * @return username
   */
  public String getUsername() {

    return this.username;
  }

  /**
   * @param username new value of {@link #getusername}.
   */
  public void setUsername(String username) {

    this.username = username;
  }

  /**
   * @return drugsId
   */
  public String getDrugsId() {

    return this.drugsId;
  }

  /**
   * @param drugsId new value of {@link #getdrugsId}.
   */
  public void setDrugsId(String drugsId) {

    this.drugsId = drugsId;
  }

  /**
   * @return drugsName
   */
  public String getDrugsName() {

    return this.drugsName;
  }

  /**
   * @param drugsName new value of {@link #getdrugsName}.
   */
  public void setDrugsName(String drugsName) {

    this.drugsName = drugsName;
  }

  /**
   * @return drugsCost
   */
  public double getDrugsCost() {

    return this.drugsCost;
  }

  /**
   * @param drugsCost new value of {@link #getdrugsCost}.
   */
  public void setDrugsCost(double drugsCost) {

    this.drugsCost = drugsCost;
  }

  /**
   * @return drugsQty
   */
  public int getDrugsQty() {

    return this.drugsQty;
  }

  /**
   * @param drugsQty new value of {@link #getdrugsQty}.
   */
  public void setDrugsQty(int drugsQty) {

    this.drugsQty = drugsQty;
  }

  /**
   * @return stockQty
   */
  public int getStockQty() {

    return this.stockQty;
  }

  /**
   * @param stockQty new value of {@link #getstockQty}.
   */
  public void setStockQty(int stockQty) {

    this.stockQty = stockQty;
  }

  /**
   * @return drugsDescription
   */
  public String getDrugsDescription() {

    return this.drugsDescription;
  }

  /**
   * @param drugsDescription new value of {@link #getdrugsDescription}.
   */
  public void setDrugsDescription(String drugsDescription) {

    this.drugsDescription = drugsDescription;
  }

  /**
   * @return total
   */
  public double getTotal() {

    return this.total;
  }

  /**
   * @param total new value of {@link #gettotal}.
   */
  public void setTotal(double total) {

    this.total = total;
  }

}
