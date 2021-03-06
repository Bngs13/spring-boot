package spring.boot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.boot.model.Vet;

@Service
@Profile("service")
public interface VetService extends CrudService<Vet,Long> {
}
