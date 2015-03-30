package models;

import javax.persistence.Entity;

import net.sf.oval.constraint.MinLength;
import play.data.validation.Match;
import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Socio extends Model {
	
	
	@Match(value="[0-9]+$",message="Ingrese solo números")
	@Required(message="Ingrese el número de cedula")
	@MaxSize(value=10,message="La cédula no puede tener mas de 10 dígitos")
	@MinLength(value=10,message="La cédula no puede tener menos de 10 dígitos")
	@Unique(message="Esta cedula ya ha sido Registrada Anteriormente")
	public String cedula;
	
	
	@Required(message="Ingrese los apellidos")
	@Match(value="[áéíóúÁÉÍÓÚñÑA-Za-z ]+$",message="Ingrese solo letras")
	public String apellido;
	

	@Match(value="[áéíóúÁÉÍÓÚñÑA-Za-z ]+$",message="Ingrese solo letras")
	@Required(message="Ingrese los nombres")
	public String nombre;
	
	

	
	public Blob foto;
	
	public String toString(){
		return apellido+" "+nombre;
	}
    
}
