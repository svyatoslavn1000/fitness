package ru.gofit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import ru.gofit.entities.CoachProfile;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

import static ru.gofit.helpers.Messages.DATA_NOT_BLANK;

/**
 * Dto представление сущности Исходящие транзакции тренера
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Dto представление сущности Исходящие транзакции тренера")
public class OutcomingCoachTransactionsDto {
    @Positive
    @NotBlank(message = DATA_NOT_BLANK)
    @ApiModelProperty(notes = "Идентификатор транзакции", dataType = "Long",
            example = "1", required = true, position = 0)
    private Long Id;

    @DateTimeFormat(pattern="yyyy:MM:dd:HH:mm")
    @ApiModelProperty(notes = "Дата и время транзакции",
            dataType = "LocalTime", example = "2021:10:12:10:15", required = true, position = 1)
    private LocalDateTime dateTime;

    @ApiModelProperty(notes = "Профиль тренера",
            dataType = "CoachProfile",  required = true, position = 2)
    private CoachProfile coachProfile;

    @ApiModelProperty(notes = "Денежный счет, на который осуществлен исходящий перевод",
            dataType = "String",  required = true, position = 3)
    private String account;
}
