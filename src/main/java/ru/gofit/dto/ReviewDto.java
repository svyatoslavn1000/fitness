package ru.gofit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import static ru.gofit.helpers.Messages.DATA_NOT_BLANK;

/**
 * Dto представление сущности Отзыв о тренере
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Dto представление сущности Отзыв о тренере")
public class ReviewDto {
    @Positive
    @NotBlank(message = DATA_NOT_BLANK)
    @ApiModelProperty(notes = "Идентификатор отзыва", dataType = "Long",
            example = "1", required = true, position = 0)
    private Integer id;

    @Size(min = 5, max = 255)
    @ApiModelProperty(notes = "Текст отзыва",
            dataType = "String",example = "Отличный тренер", required = true, position = 1)
    private String text;

    @Size(min = 1, max = 5)
    @ApiModelProperty(notes = "Рейтинговая оценка тренера",
            dataType = "Short",example = "5", required = true, position = 2)
    private Short rating;

    @ApiModelProperty(notes = "Профиль тренера",
            dataType = "CoachProfileDto", required = true, position = 3)
    private CoachProfileDto coachProfileDto;

    @ApiModelProperty(notes = "Профиль клиента, написавшего отзыв",
            dataType = "ClientProfileDto", required = true, position = 3)
    private ClientProfileDto clientProfileDto;
}
