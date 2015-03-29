package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Socio extends Model {
	public String nombre;
	public String apellido;
	public String cedula;
	public Blob foto;
    
}
