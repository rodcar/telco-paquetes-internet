package pe.telco.paquetesinternet.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "paquetes_internet")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaqueteInternet {

	@Id
	private String id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Double precio;
}
