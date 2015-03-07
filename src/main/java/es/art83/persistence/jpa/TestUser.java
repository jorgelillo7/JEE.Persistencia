package es.art83.persistence.jpa;


import java.lang.Integer;
import java.lang.String;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

	@Entity
	public class TestUser {
	    @Id
	    private Integer id;
	    private String name;
	    private String password;

	    @OneToOne(cascade = CascadeType.ALL)
	    private TestCategory category;


	    public TestUser() {
	        super();
	    }
	    
	   
	    public Integer getId() {
	        return this.id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }


		public TestCategory getCategory() {
			return category;
		}


		public void setCategory(TestCategory category) {
			this.category = category;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}

		@Override
	    public String toString() {
	        return "TestUser [id=" + id + ", password=" + password + ", category=" + category + "]";
	    }

	   
	

}
