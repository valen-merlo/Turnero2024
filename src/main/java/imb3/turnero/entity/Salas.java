package imb3.turnero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Salas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idSalas;
	@NotBlank(message = "El nombre no puede estar vacío")
	@Size(max = 20, message = "El nombre no debe superar los 10 caracteres")
	private	String nombre;
	private boolean disponibles;
	private String ubicacion;
	public Integer getIdSalas() {
		return idSalas;
	}
	public void setIdSalas(Integer idSalas) {
		this.idSalas = idSalas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isDisponibles() {
		return disponibles;
	}
	public void setDisponibles(boolean disponibles) {
		this.disponibles = disponibles;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
	
}
