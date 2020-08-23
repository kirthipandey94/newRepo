package com.customerTariff.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_TARIFF")
public class CustomerTariff {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="TARRIF_PLAN")
	private String tarrifPlan;
	
	@Column(name="TARIFF_ID")
	private String tarrifId;
	
	@Column(name="TARIFF_PRICE")
	private int tarrifPrice;
	
	@Column(name="SORT_ORDER")
	private int sortOrder;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTarrifPlan() {
		return tarrifPlan;
	}

	public void setTarrifPlan(String tarrifPlan) {
		this.tarrifPlan = tarrifPlan;
	}

	public String getTarrifId() {
		return tarrifId;
	}

	public void setTarrifId(String tarrifId) {
		this.tarrifId = tarrifId;
	}

	public int getTarrifPrice() {
		return tarrifPrice;
	}

	public void setTarrifPrice(int tarrifPrice) {
		this.tarrifPrice = tarrifPrice;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public String toString() {
		return "CustomerTariff [id=" + id + ", tarrifPlan=" + tarrifPlan + ", tarrifId=" + tarrifId + ", tarrifPrice="
				+ tarrifPrice + ", sortOrder=" + sortOrder + "]";
	}
}
