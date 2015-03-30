package controllers;

import models.Socio;
import models.Usuario;
import play.mvc.Before;
import play.mvc.With;
@With(Secure.class)
public class Socios extends CRUD {

	@Before
	public static void mostrarUsuario(){
		try{
			Usuario user = Usuario.find("byEmail", Security.connected()).first();
			//obteniendo datos del usuario que ha iniciado sesion
			if(Security.isConnected()) {
		        renderArgs.put("conectado", user.nombre+" "+user.apellido); 
		    }
			}catch(Exception ex){
				
			}
	}
	
	 public static void verFoto(Long id){
	    	Socio s=Socio.findById(id);
	    	  response.setContentTypeIfNotSet(s.foto.type());
	          renderBinary(s.foto.get());
	    }

}
