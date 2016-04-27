package com.euroscripting.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="sx_countries")
public class SxCountries implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6101005643241945668L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional=false)
	@Column(name="sx_country_id")
	private Integer sxCountryId;
	
	@Column(name="sx_country_name", nullable=false, length=50)
	private String sxCountryName;

	@OneToMany(mappedBy="sxCountries", cascade= {CascadeType.ALL})
	private Set<SxRegions> sxRegions;
	
	public Integer getSxCountryId() {
		return sxCountryId;
	}

	public void setSxCountryId(Integer sxCountryId) {
		this.sxCountryId = sxCountryId;
	}

	public String getSxCountryName() {
		return sxCountryName;
	}

	public void setSxCountryName(String sxCountryName) {
		this.sxCountryName = sxCountryName;
	}

	public Set<SxRegions> getSxRegions() {
		return sxRegions;
	}

	public void setSxRegions(Set<SxRegions> sxRegions) {
		this.sxRegions = sxRegions;
	}
		
	
}
