package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Usuario extends Model {
	public String nombre;
	public String apellido;
	public String email;
	public String password;
	public boolean isAdmin;
	
	public Usuario(String nombre, String apellido, String email,
			String password, boolean isAdmin) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	
    
}
