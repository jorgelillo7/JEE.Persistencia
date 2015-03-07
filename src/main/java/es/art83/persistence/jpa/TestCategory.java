package es.art83.persistence.jpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestCategory {
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
    private String description;

    public TestCategory() {
    }


    public Integer getId() {
        return this.id;
    }
 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}




    @Override
    public String toString() {
        return "TestCategory [id=" + id + ", description=" + description + "]";
    }

}

