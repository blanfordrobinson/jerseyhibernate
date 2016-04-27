package org.ici.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="sx_cities")
public class SxCities implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6101005643241945668L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional=false)
	@Column(name="sx_city_id")
	private Integer sxCityId;
	
	@Column(name="sx_city_name", nullable=false, length=50)
	private String sxCityName;

	@ManyToOne
	@JoinColumn(name="sx_region_id")
	private SxRegions sxRegions;
	
	@OneToMany(mappedBy="sxCities", cascade= {CascadeType.ALL})
	private Set<SxUser> sxUsers;
	
	public Integer getSxCityId() {
		return sxCityId;
	}

	public void setSxCityId(Integer sxCityId) {
		this.sxCityId = sxCityId;
	}

	public String getSxCityName() {
		return sxCityName;
	}

	public void setSxCityName(String sxCityName) {
		this.sxCityName = sxCityName;
	}

	public Set<SxUser> getSxUsers() {
		return sxUsers;
	}

	public void setSxUsers(Set<SxUser> sxUsers) {
		this.sxUsers = sxUsers;
	}

	public SxRegions getSxRegions() {
		return sxRegions;
	}

	public void setSxRegions(SxRegions sxRegions) {
		this.sxRegions = sxRegions;
	}



}
