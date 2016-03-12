package li.barlog.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
public class Foo extends AbstractEntity {
	@Id
	@GeneratedValue
	private long fooId;
	
	

	public long getFooId() {
		return fooId;
	}
	public void setFooId(long fooId) {
		this.fooId = fooId;
	}

	@Basic
	@Column
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
		return "Foo {" +
				"id='" + getFooId() + "', " +
				"data='" + getData() + "', " +
				"version='" + getVersion() + "', " +
				"createdDate='" + getCreatedDate() + "', " +
				"createdBy='" + getCreatedBy() + "', " +
				"lastModifiedDate='" + getLastModifiedDate() + "', " +
				"lastModifiedBy='" + getLastModifiedBy() + "'} ";
	}
}
