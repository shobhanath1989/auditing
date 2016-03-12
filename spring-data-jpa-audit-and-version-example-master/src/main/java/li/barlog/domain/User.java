package li.barlog.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class User extends AbstractEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private long userId;

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Basic
	@Column
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String data) {
		this.name = data;
	}

	@Version
	@Column
	private Long version;
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "User {" +
				"id='" + getUserId() + "', " +
				"data='" + getName() + "', " +
				"version='" + getVersion() + "', " +
				"createdDate='" + getCreatedDate() + "', " +
				"createdBy='" + getCreatedBy() + "', " +
				"lastModifiedDate='" + getLastModifiedDate() + "', " +
				"lastModifiedBy='" + getLastModifiedBy() + "'} ";
	}
}
