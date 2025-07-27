package com.luruoyang.test1;

/**
 * @author luruoyang
 */
public class PurchaseRequest {
  private String purpose;
  private Integer number;
  private Double amount;

  public PurchaseRequest() {
  }

  public PurchaseRequest(String purpose, Integer number, Double amount) {
    this.purpose = purpose;
    this.number = number;
    this.amount = amount;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
}
