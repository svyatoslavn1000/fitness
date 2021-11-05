package ru.gofit.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import ru.gofit.dto.SportTypeDto;
import ru.gofit.entities.SportType;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SportTypeMapper {

    SportTypeDto mapEntityToDto(SportType entity);

    SportType mapDtoToEntity(SportTypeDto sportTypeDto);

    SportType update(@MappingTarget SportType entity, SportTypeDto sportTypeDto);
}
