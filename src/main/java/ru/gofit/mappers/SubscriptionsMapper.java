package ru.gofit.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import ru.gofit.dto.SubscriptionDto;
import ru.gofit.entities.Subscription;

/**
 * Маппер, преобразующий классы Subscription и SubscriptionDto друг в друга
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubscriptionsMapper {
    SubscriptionDto mapEntityToDto(Subscription entity);

    Subscription mapDtoToEntity(SubscriptionDto subscriptionDto);

    Subscription update(@MappingTarget Subscription entity, SubscriptionDto subscriptionDto);
}
