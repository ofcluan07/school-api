package net.school4poa.school.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentModel {
	
	@Id
	@GeneratedValue
	public Integer Id;
	
	@Column(nullable = false, length = 50)
	public String Name;
	
	@Column(nullable = true)
    public Date DateCreated;
	
	@Column(nullable = true)
    public Date DateBirth;
    
	@Column(nullable = true)
    public String Genery;
    
	@Column(nullable = true)
    public String Nationality;
    
	@Column(nullable = true)
    public String NameMother;
    
	@Column(nullable = true)
    public String NameFather;
	
	@Column(nullable = true)
    public String School;

   

    public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDateCreated() {
		return DateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		DateCreated = dateCreated;
	}

	public Date getDateBirth() {
		return DateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		DateBirth = dateBirth;
	}

	public String getGenery() {
		return Genery;
	}

	public void setGenery(String genery) {
		Genery = genery;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public String getNameMother() {
		return NameMother;
	}

	public void setNameMother(String nameMother) {
		NameMother = nameMother;
	}

	public String getNameFather() {
		return NameFather;
	}

	public void setNameFather(String nameFather) {
		NameFather = nameFather;
	}

	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}

	
	
}
