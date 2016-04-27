package org.ici.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="sx_regions")
public class SxRegions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6101005643241945668L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional=false)
	@Column(name="sx_region_id")
	private Integer sxRegionId;
	
	@Column(name="sx_region_name", nullable=false, length=50)
	private String sxRegionName;
	
	@ManyToOne
	@JoinColumn(name="sx_country_id")
	private SxCountries sxCountries;
	
	@OneToMany(mappedBy="sxRegions", cascade= {CascadeType.ALL})
	private Set<SxCities> sxCities;

	public Integer getSxRegionId() {
		return sxRegionId;
	}

	public void setSxRegionId(Integer sxRegionId) {
		this.sxRegionId = sxRegionId;
	}

	public String getSxRegionName() {
		return sxRegionName;
	}

	public void setSxRegionName(String sxRegionName) {
		this.sxRegionName = sxRegionName;
	}

	public Set<SxCities> getSxCities() {
		return sxCities;
	}

	public void setSxCities(Set<SxCities> sxCities) {
		this.sxCities = sxCities;
	}

	public SxCountries getSxCountries() {
		return sxCountries;
	}

	public void setSxCountries(SxCountries sxCountries) {
		this.sxCountries = sxCountries;
	}

}
