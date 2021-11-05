package ru.gofit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.Set;

import static ru.gofit.helpers.Messages.DATA_NOT_BLANK;


/**
 * Dto представление сущности Инвентарь тренировки
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Dto представление сущности Инвентарь тренировки")
public class InventoryDto {
    @Positive
    @NotBlank(message = DATA_NOT_BLANK)
    @ApiModelProperty(notes = "Идентификатор инвентаря", dataType = "Long",
            example = "1", required = true, position = 0)
    private Short id;

    @ApiModelProperty(notes = "Описание инвентаря",
            dataType = "String",example = "Коврик для фитнеса", required = true, position = 1)
    private String description;

    @ApiModelProperty(notes = "Тренировки, где используется инвентарь",
            dataType = "Set<TrainingDto>", required = true, position = 2)
    private Set<TrainingDto> trainings;
}
