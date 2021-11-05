package ru.gofit.services.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.gofit.dto.SportTypeDto;

public interface SportTypeService {

    /**
     * Найти все виды спорта
     *
     * @param pageable количество страниц и количество видов спорта на странице
     * @return список видов спорта
     */
    Page<SportTypeDto> getAll(Pageable pageable);

    /**
     * Найти вид спорта по его идентификатору
     *
     * @param id идентификатор вида спорта
     * @return вид спорта
     */
    SportTypeDto getById(Short id);

    /**
     * Создать новый вид спорта
     *
     * @param sportTypeRqDto запрос с данными вида спорта
     * @return новый вид спорта, сохраненный в репозитории
     */
    SportTypeDto save(SportTypeDto sportTypeRqDto);

    /**
     * Изменить описание вида спорта
     *
     * @param id             вида спорта
     * @param sportTypeDto изиененное описание вида спорта
     * @return измененный вид спорта, сохраненный в репозитории
     */
    SportTypeDto update(Short id, SportTypeDto sportTypeDto);

    /**
     * Удалить вид спорта по его идентификатору
     *
     * @param id идентификатор вида спорта
     */
    void deleteById(Short id);
}
