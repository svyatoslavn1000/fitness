package ru.gofit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

/**
 * Dto представление сущности Тренировка
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Dto представление сущности Тренировка")
public class TrainingDto {


    @Positive
    @ApiModelProperty(notes = "Уникальный идентификатор тренировки",
            dataType = "Long", example = "1", required = true, position = 0)
    private Long trainingId;

    @ApiModelProperty(notes = "Название тренировки",
            dataType = "String",  example = "тренировка хатха-йога", required = true, position = 1)
    private String trainingName;

    @DateTimeFormat(pattern="yyyy:MM:dd:HH:mm")
    @ApiModelProperty(notes = "Время начала тренировки",
            dataType = "LocalTime", example = "2021:10:12:11:15", required = true, position = 2)
    private LocalDateTime startDateTime;

    @DateTimeFormat(pattern="yyyy:MM:dd:HH:mm")
    @ApiModelProperty(notes = "Время окончания тренировки",
            dataType = "LocalTime", example = "2021:10:12:10:15", required = true, position = 3)
    private LocalDateTime endDateTime;

    @ApiModelProperty(notes = "Вид спорта",
            dataType = "String",  required = true, position = 4)
    private SportTypeDto sportTypeDto;

}