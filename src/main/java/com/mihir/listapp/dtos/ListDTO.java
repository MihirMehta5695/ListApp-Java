package com.mihir.listapp.dtos;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListDTO
{
	@XmlElement
	private ArrayList<ListItemDTO> listOfItems;

}
