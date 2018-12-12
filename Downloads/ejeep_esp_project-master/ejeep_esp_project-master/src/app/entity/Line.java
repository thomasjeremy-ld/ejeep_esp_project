package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlID;

@Entity
public class Line 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long id;
	
	@Column
	private String name;
	
	public Long getID()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Line [id= " + id + ", name= " + name + "]";
	}
}
