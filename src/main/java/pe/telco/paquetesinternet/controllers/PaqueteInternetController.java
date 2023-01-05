package pe.telco.paquetesinternet.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import pe.telco.paquetesinternet.entities.PaqueteInternet;
import pe.telco.paquetesinternet.messages.requests.PaqueteInternetCreateRequest;
import pe.telco.paquetesinternet.services.PaqueteInternetService;

@RestController
@RequestMapping(value = "/paquetesinternet")
public class PaqueteInternetController {

	@Autowired
	private PaqueteInternetService paqueteInternetService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PaqueteInternet>> fetchAll() {
		try {
			List<PaqueteInternet> paquetes = paqueteInternetService.findAll();
			return (paquetes.isEmpty()) ? ResponseEntity.noContent().build() : ResponseEntity.ok(paquetes);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().build();
		}
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@Validated @RequestBody PaqueteInternetCreateRequest request) {
		try {
			PaqueteInternet paquete = PaqueteInternet.builder().nombre(request.getNombre())
					.descripcion(request.getDescripcion()).precio(request.getPrecio()).build();
			PaqueteInternet nuevoPaquete = paqueteInternetService.save(paquete);
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(nuevoPaquete.getId()).toUri();
			return ResponseEntity.created(location).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().build();
		}
	}

}
