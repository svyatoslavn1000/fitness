package ru.gofit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.Positive;

/**
 * Dto представление сущности Вид спорта
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Dto представление сущности Вид спорта")
public class SportTypeDto {

    @Positive
    @ApiModelProperty(notes = "Уникальный идентификатор Вида спорта",
            dataType = "Long", example = "1", required = true, position = 0)
    private Short id;

    @ApiModelProperty(notes = "Название вида спорта",
            dataType = "String",  example = "хатха-йога", required = true, position = 1)
    private String description;
}
