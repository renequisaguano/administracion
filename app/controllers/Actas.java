package controllers;

import models.Usuario;
import play.mvc.*;

@With(Secure.class)
public class Actas extends CRUD {

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

}
