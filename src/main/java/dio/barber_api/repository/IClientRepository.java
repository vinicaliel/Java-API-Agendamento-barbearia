package dio.barber_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.barber_api.entity.ClientEntity;
import java.util.Optional;


@Repository
public interface IClientRepository extends JpaRepository<ClientEntity, Long>{

    boolean existsByEmail(final String email);

    boolean existsByPhone(final String phone);

    Optional<ClientEntity> findByEmail(final String email);

    Optional<ClientEntity> findByPhone(final String phone);



}
