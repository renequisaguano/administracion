package controllers;

import models.Socio;

public class Socios extends CRUD {

 
	 public static void verFoto(Long id){
	    	Socio s=Socio.findById(id);
	    	  response.setContentTypeIfNotSet(s.foto.type());
	          renderBinary(s.foto.get());
	    }

}
