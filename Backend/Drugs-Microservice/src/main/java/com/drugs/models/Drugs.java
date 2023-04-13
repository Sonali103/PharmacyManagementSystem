package com.drugs.models;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "drugs")
@Data

public class Drugs {

  @Transient
  public static final String SEQUENCE_NAME = "drugs_sequence";

  @Id
  private String drugsId;

  private String drugsName;

  private double drugsCost;

  private int stockQty;

  private String categories;

  private String drugsDescription;

  private String supplierName;

  private String dateOfExpiration;

  private Set<Photo> productImages;

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
   * @return categories
   */
  public String getCategories() {

    return this.categories;
  }

  /**
   * @param categories new value of {@link #getcategories}.
   */
  public void setCategories(String categories) {

    this.categories = categories;
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
   * @return supplierName
   */
  public String getSupplierName() {

    return this.supplierName;
  }

  /**
   * @param supplierName new value of {@link #getsupplierName}.
   */
  public void setSupplierName(String supplierName) {

    this.supplierName = supplierName;
  }

  /**
   * @return dateOfExpiration
   */
  public String getDateOfExpiration() {

    return this.dateOfExpiration;
  }

  /**
   * @param dateOfExpiration new value of {@link #getdateOfExpiration}.
   */
  public void setDateOfExpiration(String dateOfExpiration) {

    this.dateOfExpiration = dateOfExpiration;
  }

  /**
   * @return productImages
   */
  public Set<Photo> getProductImages() {

    return this.productImages;
  }

  /**
   * @param productImages new value of {@link #getproductImages}.
   */
  public void setProductImages(Set<Photo> productImages) {

    this.productImages = productImages;
  }

  /**
   * @return sequenceName
   */
  public static String getSequenceName() {

    return SEQUENCE_NAME;
  }

}
