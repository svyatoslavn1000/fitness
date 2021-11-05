package ru.gofit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import ru.gofit.entities.ClientProfile;
import ru.gofit.entities.Subscription;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

import static ru.gofit.helpers.Messages.DATA_NOT_BLANK;

/**
 * Dto представление сущности Транзакции клиента
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Dto представление сущности Входящие Транзакции клиента")
public class ClientTransactionDto {
    @Positive
    @NotBlank(message = DATA_NOT_BLANK)
    @ApiModelProperty(notes = "Идентификатор транзакции", dataType = "Long",
            example = "1", required = true, position = 0)
    private Long Id;

    @DateTimeFormat(pattern="yyyy:MM:dd:HH:mm")
    @ApiModelProperty(notes = "Дата и время транзакции",
            dataType = "LocalTime", example = "2021:10:12:10:15", required = true, position = 1)
    private LocalDateTime dateTime;

    @ApiModelProperty(notes = "Профиль клиента",
            dataType = "CoachProfile",  required = true, position = 2)
    private ClientProfile clientProfile;

    @ApiModelProperty(notes = "Пакет тренировок, для покупки которого осуществлен перевод",
            dataType = "SubscriptionDto",  required = true, position = 3)
    private Subscription subscription;
}
