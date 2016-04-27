package org.ici.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="sx_user")
public class SxUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6101005643241945668L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional=false)
	@Column(name="sx_user_id")
	private Integer sxUserId;
	
	@Column(name="sx_username", nullable=false, length=25)
	private String sxUsername;
	
	@Column(name="sx_email", nullable=false, length=50)
	private String sxEmail;

	@Column(name="sx_password", nullable=false, length=25)
	private String sxPassword;
	
	@Column(name="sx_create_dt", nullable=false)
	private Date sxCreateDt;
	
	@Column(name="sx_update_dt", nullable=false)
	private Date sxUpdateDt;

	@ManyToOne
	@JoinColumn(name="sx_currency_id")
	private SxCurrencies sxCurrencies;
	
	@ManyToOne
	@JoinColumn(name="sx_city_id")
	private SxCities sxCities;
	
	public SxUser(){
	}

	public Integer getSxUserId() {
		return sxUserId;
	}

	public void setSxUserId(Integer sxUserId) {
		this.sxUserId = sxUserId;
	}

	public String getSxUsername() {
		return sxUsername;
	}

	public void setSxUsername(String sxUsername) {
		this.sxUsername = sxUsername;
	}

	public String getSxEmail() {
		return sxEmail;
	}

	public void setSxEmail(String sxEmail) {
		this.sxEmail = sxEmail;
	}

	public String getSxPassword() {
		return sxPassword;
	}

	public void setSxPassword(String sxPassword) {
		this.sxPassword = sxPassword;
	}

	public Date getSxCreateDt() {
		return sxCreateDt;
	}

	public void setSxCreateDt(Date sxCreateDt) {
		this.sxCreateDt = sxCreateDt;
	}

	public Date getSxUpdateDt() {
		return sxUpdateDt;
	}

	public void setSxUpdateDt(Date sxUpdateDt) {
		this.sxUpdateDt = sxUpdateDt;
	}

	public SxCurrencies getSxCurrencies() {
		return sxCurrencies;
	}

	public void setSxCurrencies(SxCurrencies sxCurrencies) {
		this.sxCurrencies = sxCurrencies;
	}

	public SxCities getSxCities() {
		return sxCities;
	}

	public void setSxCities(SxCities sxCities) {
		this.sxCities = sxCities;
	}

	
}
