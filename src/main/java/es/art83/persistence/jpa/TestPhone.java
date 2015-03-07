package es.art83.persistence.jpa;
 
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import es.art83.persistence.models.utils.PhoneType;

	@Entity
	public class TestPhone {
	    public static final String FIND_PHONES_BY_TYPE = "findPhonesByType";

	    public static final String TYPE = "type";

	    @Id
	    @GeneratedValue
	    private Integer id;

	    @Enumerated(EnumType.STRING)
	    private PhoneType phoneType;

	    private int number;
	    
	    @OneToOne
	    @JoinColumn
	    private TestUser user;

	    public TestPhone(PhoneType phoneType, int number) {
	        this.phoneType = phoneType;
	        this.number = number;
	    }

	    public TestPhone() {
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public PhoneType getPhoneType() {
	        return phoneType;
	    }

	    public void setPhoneType(PhoneType phoneType) {
	        this.phoneType = phoneType;
	    }

	    public int getNumber() {
	        return number;
	    }

	    public void setNumber(int number) {
	        this.number = number;
	    }

	    public TestUser getUser() {
	        return user;
	    }

	    public void setUser(TestUser user) {
	        this.user = user;
	    }
	    
	    @Override
	    public String toString() {
	        return "Phone [id=" + id + ", phoneType=" + phoneType + ", number=" + number + "]";
	    }

	   
	}


