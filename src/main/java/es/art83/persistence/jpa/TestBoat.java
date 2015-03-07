package es.art83.persistence.jpa;



	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;

	@Entity
	public class TestBoat {
	    @Id
	    @GeneratedValue
	    private Integer id;

	    private String description;

	    @OneToOne
	    @JoinColumn
	    private TestUser user;

	  
	    public TestBoat() {
	    }

	    public Integer getId() {
	        return id;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public TestUser getUser() {
	        return user;
	    }

	    public void setUser(TestUser user) {
	        this.user = user;
	    }

	    @Override
	    public String toString() {
	        return "Boat [id=" + id + ", description=" + description + ", user=" + user + "]";
	    }

	}

