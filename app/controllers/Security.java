package controllers;

import models.Usuario;

public class Security extends Secure.Security {

	public static boolean authenticate(String username, String password) {
		 Usuario user = Usuario.find("byEmail", username).first();
	      return user != null && user.password.equals(password);
	}
	
	public static void registro(){
		render();
	}
	
	public static void guardarUsuario(String email, String nombre, String apellido, String password, String passwordR){
		flash.put("email",email);
		flash.put("nombre",nombre);
		flash.put("apellido",apellido);
		
		Usuario usuario=Usuario.find("byEmail",email).first();
		
		if(usuario==null){
			
			if (password.equals(passwordR)){
				
				Usuario nuevo=new Usuario(nombre,apellido,email,password,false);
				nuevo.save();
				authenticate(email, password);
				redirect("/");
				
			}else
			{
				flash.put("password_diferentes", "Las contraseñas no coinciden, debe ingresar el mismo valor en ambos campos.");
				redirect("/security/registro");
			}
			
		}else{
			flash.put("email_usado",email+" ya esta esta siendo utilizado, pruebe con otro email");
			redirect("/security/registro");
		}
		
		
		
	}

}
