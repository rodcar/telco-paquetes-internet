package pe.telco.paquetesinternet.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.telco.paquetesinternet.entities.PaqueteInternet;
import pe.telco.paquetesinternet.repositories.PaqueteInternetRepository;
import pe.telco.paquetesinternet.services.PaqueteInternetService;

@Service
public class PaqueteInternetServiceImpl implements PaqueteInternetService{
	
	@Autowired
	private PaqueteInternetRepository paqueteInternetRepository;

	@Override
	public List<PaqueteInternet> findAll() throws Exception {
		return paqueteInternetRepository.findAll();
	}

	@Override
	public PaqueteInternet save(PaqueteInternet t) throws Exception {
		return paqueteInternetRepository.save(t);
	}

	@Override
	public PaqueteInternet update(PaqueteInternet t) throws Exception {
		return paqueteInternetRepository.save(t);
	}

	@Override
	public void deleteById(String id) throws Exception {
		paqueteInternetRepository.deleteById(id);
	}

	@Override
	public Optional<PaqueteInternet> findById(String id) throws Exception {
		return paqueteInternetRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) throws Exception {
		return paqueteInternetRepository.existsById(id);
	}

}
