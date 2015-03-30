package models;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Socio extends Model {
	
	@Pattern(regexp = "^[\\p{L} .'-]+$")
	@Required(message="Ingrese los nombres")
	public String nombre;
	@Required(message="Ingrese los apellidos")
	public String apellido;
	@Required(message="Ingrese el numero de cedula")
	@Unique(message="Esta cedula ya ha sido Registrada Anteriormente")
	public String cedula;
	public Blob foto;
	
	public String toString(){
		return apellido+" "+nombre;
	}
    
}
