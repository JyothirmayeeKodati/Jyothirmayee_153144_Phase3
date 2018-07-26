package com.cg.mypaymentapp.beans;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paytm_transaction_histories")
public class TransactionHistory {
	private String mobileNo;
	private Date transaction_date;
	private String type;
	private BigDecimal amount;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionId;
	public TransactionHistory() 
	{
		
	}
	public TransactionHistory(String mobileNo, Date date, String type, BigDecimal amount) {
		super();
		this.mobileNo = mobileNo;
		this.transaction_date = date;
		this.type = type;
		this.amount = amount;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDate() {
		return transaction_date;
	}
	public void setDate(Date date) {
		this.transaction_date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + transactionId;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionHistory other = (TransactionHistory) obj;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (transactionId != other.transactionId)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TransactionHistory [mobileNo=" + mobileNo + ", transaction_date=" + transaction_date + ", type=" + type
				+ ", amount=" + amount + ", transactionId=" + transactionId + "]";
	}
	
}
