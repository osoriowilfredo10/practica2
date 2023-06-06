package com.certus.item;


import java.util.ArrayList;
import java.util.List;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/items")
public class Listado {
	List<Items>listaitems =new ArrayList<>();
	
	public Listado() {
	listaitems.add(new Items(3,"Maria","Lopez"));
	listaitems.add(new Items(2,"Luis","Lopez"));
	listaitems.add(new Items(1,"M","Lopez"));
	}
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Items> getItems() {
	return listaitems;
	}
	
	@GET
	@Path("/{id}") 
	@Produces({MediaType.APPLICATION_JSON})
	public Items getItemById(@PathParam("id")  Integer id){
		for(Items item: listaitems){
			if (item.getId().equals(id)) {
				return item;
			}
		}
		return null;
		
  }
		
}

