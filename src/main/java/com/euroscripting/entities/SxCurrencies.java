package com.euroscripting.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="sx_currencies")
public class SxCurrencies implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6253921449876814550L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional=false)
	@Column(name="sx_currency_id")
	private Integer sxCurrencyId;
	
	@Column(name="sx_currency_symbol", nullable=false, length=25)
	private String sxCurrencySymbol;
	
	@Column(name="sx_currency_name", nullable=false, length=50)
	private String sxCurrencyName;

	@OneToMany(mappedBy="sxCurrencies", cascade= {CascadeType.ALL})
	private Set<SxUser> sxUsers;
	
	public SxCurrencies() {
	}
	
	
	public Integer getSxCurrencyId() {
		return sxCurrencyId;
	}

	public void setSxCurrencyId(Integer sxCurrencyId) {
		this.sxCurrencyId = sxCurrencyId;
	}

	public String getSxCurrencySymbol() {
		return sxCurrencySymbol;
	}

	public void setSxCurrencySymbol(String sxCurrencySymbol) {
		this.sxCurrencySymbol = sxCurrencySymbol;
	}

	public String getSxCurrencyName() {
		return sxCurrencyName;
	}

	public void setSxCurrencyName(String sxCurrencyName) {
		this.sxCurrencyName = sxCurrencyName;
	}


	public Set<SxUser> getSxUsers() {
		return sxUsers;
	}


	public void setSxUsers(Set<SxUser> sxUsers) {
		this.sxUsers = sxUsers;
	}


	
}