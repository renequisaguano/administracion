package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Acta extends Model {
	
	@Required
	public String descripcion;


    @Lob
    @Required
    @MaxSize(10000)
	public String contenido; 
	

	
	
	
	
	public String toString(){
		return this.descripcion;
	}
    
}
