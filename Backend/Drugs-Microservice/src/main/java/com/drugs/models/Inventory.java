package com.drugs.models;

import java.util.List;

import lombok.Data;

@Data
public class Inventory {

  private List<Drugs> drugs;

  private Supplier supplier;

  /**
   * @return drugs
   */
  public List<Drugs> getDrugs() {

    return this.drugs;
  }

  /**
   * @param drugs new value of {@link #getdrugs}.
   */
  public void setDrugs(List<Drugs> drugs) {

    this.drugs = drugs;
  }

  /**
   * @return supplier
   */
  public Supplier getSupplier() {

    return this.supplier;
  }

  /**
   * @param supplier new value of {@link #getsupplier}.
   */
  public void setSupplier(Supplier supplier) {

    this.supplier = supplier;
  }

}
