package ru.gofit.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import ru.gofit.dto.TrainingDto;
import ru.gofit.entities.Training;

/**
 * Маппер, преобразующий классы Training и TrainingDto друг в друга
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrainingMapper {
    TrainingDto mapEntityToDto(Training entity);

    Training mapDtoToEntity(TrainingDto trainingDto);

    Training update(@MappingTarget Training entity, TrainingDto trainingDto);
}
