package ru.gofit.mappers;

import org.mapstruct.*;
import ru.gofit.dto.*;
import ru.gofit.entities.ClientProfile;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientProfileMapper {

    ClientProfileDto mapEntityToDto(ClientProfile entity);

    @Mappings({
            @Mapping(target = "user", ignore = true)
    })
    ClientProfile mapDtoToEntity(ClientProfileDto clientProfileDto);

    @Mappings({
            @Mapping(target = "user", ignore = true)
    })
    ClientProfile update(@MappingTarget ClientProfile entity, ClientProfileDto clientProfileDto);
}
