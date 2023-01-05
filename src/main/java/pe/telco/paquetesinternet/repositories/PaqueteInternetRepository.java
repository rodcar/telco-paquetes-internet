package pe.telco.paquetesinternet.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pe.telco.paquetesinternet.entities.PaqueteInternet;

@Repository
public interface PaqueteInternetRepository extends MongoRepository<PaqueteInternet, String> {

}
