package dio.barber_api.mapper;

import dio.barber_api.controller.request.SaveClientRequest;
import dio.barber_api.controller.request.UpdateClientRequest;
import dio.barber_api.controller.response.ClientDetailResponse;
import dio.barber_api.controller.response.ListClientResponse;
import dio.barber_api.controller.response.SaveClientResponse;
import dio.barber_api.controller.response.UpdateClientResponse;
import dio.barber_api.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}