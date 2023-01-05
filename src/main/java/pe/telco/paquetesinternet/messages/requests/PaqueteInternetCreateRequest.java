package pe.telco.paquetesinternet.messages.requests;

import lombok.Data;

@Data
public class PaqueteInternetCreateRequest {
	private String nombre;
	private String descripcion;
	private Double precio;
}
