/**
 * This class is generated by jOOQ
 */
package com.parallax.server.blocklyprop.db.generated.tables.pojos;


import com.parallax.server.blocklyprop.db.enums.ProjectType;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Project implements Serializable {

	private static final long serialVersionUID = 1647108702;

	private Long              id;
	private Long              idUser;
	private Long              idClouduser;
	private String            name;
	private String            description;
	private String            code;
	private ProjectType       type;
	private Boolean           private_;
	private Boolean           shared;
	private GregorianCalendar created;
	private GregorianCalendar modified;

	public Project() {}

	public Project(Project value) {
		this.id = value.id;
		this.idUser = value.idUser;
		this.idClouduser = value.idClouduser;
		this.name = value.name;
		this.description = value.description;
		this.code = value.code;
		this.type = value.type;
		this.private_ = value.private_;
		this.shared = value.shared;
		this.created = value.created;
		this.modified = value.modified;
	}

	public Project(
		Long              id,
		Long              idUser,
		Long              idClouduser,
		String            name,
		String            description,
		String            code,
		ProjectType       type,
		Boolean           private_,
		Boolean           shared,
		GregorianCalendar created,
		GregorianCalendar modified
	) {
		this.id = id;
		this.idUser = idUser;
		this.idClouduser = idClouduser;
		this.name = name;
		this.description = description;
		this.code = code;
		this.type = type;
		this.private_ = private_;
		this.shared = shared;
		this.created = created;
		this.modified = modified;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdClouduser() {
		return this.idClouduser;
	}

	public void setIdClouduser(Long idClouduser) {
		this.idClouduser = idClouduser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ProjectType getType() {
		return this.type;
	}

	public void setType(ProjectType type) {
		this.type = type;
	}

	public Boolean getPrivate() {
		return this.private_;
	}

	public void setPrivate(Boolean private_) {
		this.private_ = private_;
	}

	public Boolean getShared() {
		return this.shared;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}

	public GregorianCalendar getCreated() {
		return this.created;
	}

	public void setCreated(GregorianCalendar created) {
		this.created = created;
	}

	public GregorianCalendar getModified() {
		return this.modified;
	}

	public void setModified(GregorianCalendar modified) {
		this.modified = modified;
	}
}
