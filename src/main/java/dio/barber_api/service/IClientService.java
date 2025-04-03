package dio.barber_api.service;

import org.springframework.stereotype.Service;

import dio.barber_api.entity.ClientEntity;
@Service
public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}