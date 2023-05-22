package student.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud_detail")
public class model {
	@Id
	private String id;
	@Column
	private String stud_name;
	@Column
	private String email_id;
	@Column
	private String phone;
	@Column
	private String adress;
	
	public model() {
		super();
	}

	public model(String id, String stud_name, String email_id, String phone, String adress) {
		super();
		this.id = id;
		this.stud_name = stud_name;
		this.email_id = email_id;
		this.phone = phone;
		this.adress = adress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
