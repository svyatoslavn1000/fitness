package ru.gofit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.Set;

import static ru.gofit.helpers.Messages.DATA_NOT_BLANK;


/**
 * Dto представление сущности Профиль клиента
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Dto представление сущности Профиль клиента")
public class ClientProfileDto {

    @Positive
    @NotBlank(message = DATA_NOT_BLANK)
    @ApiModelProperty(notes = "Идентификатор пользователя", dataType = "Long", example = "1", required = true, position = 0)
    private Long userId;

    @ApiModelProperty(notes = "Информация о себе, до 500 символов",
            dataType = "String", example = "Иван, люблю бег", position = 1)
    private String clientInfo;

    @ApiModelProperty(notes = "Спортивные достижения, до 150 символов",
            dataType = "String", example = "Выиграл марафон на дне города", position = 2)
    private String sportsAchivments;

    @ApiModelProperty(notes = "Спортивный разряд, до 150 символов",
            dataType = "String", example = "1 разряд по по боксу", position = 3)
    private String sportsGrade;

    @ApiModelProperty(notes = "Список пакетов тренировок",
            dataType = "List<SubscriptionDto>", position = 4)
    private List<SubscriptionDto> subscriptionsDto;

    @ApiModelProperty(notes = "Список  тренировок клиента",
            dataType = "List<TrainingDto>", position = 5)
    private List<TrainingDto> trainingsDto;
//
//    @ApiModelProperty(notes = " Список денежных операций",
//            dataType = "List<ClientTransaction>", position = 6)
//    private List<ClientTransactionDto> clientTransactions;
//

    @ApiModelProperty(notes = " Список Виды спорта",
            dataType = "Set<SportTypeDto>", position = 6)
    private Set<SportTypeDto> sportTypesDto;
}