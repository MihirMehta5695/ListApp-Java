package com.mihir.listapp.dtos;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListItemDTO
{

	@XmlElement
	private String	listItemName;
	@XmlElement
	private Date	creationDate;
	@XmlElement
	private Date	updationDate;
	@XmlElement
	private User	createdBy;
	@XmlElement
	private User	updateBy;

	public String getListItemName()
	{
		return listItemName;
	}

	public void setListItemName(String listItemName)
	{
		this.listItemName = listItemName;
	}

	public Date getCreationDate()
	{
		return creationDate;
	}

	public void setCreationDate(Date creationDate)
	{
		this.creationDate = creationDate;
	}

	public Date getUpdationDate()
	{
		return updationDate;
	}

	public void setUpdationDate(Date updationDate)
	{
		this.updationDate = updationDate;
	}

	public User getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(User createdBy)
	{
		this.createdBy = createdBy;
	}

	public User getUpdateBy()
	{
		return updateBy;
	}

	public void setUpdateBy(User updateBy)
	{
		this.updateBy = updateBy;
	}

}
