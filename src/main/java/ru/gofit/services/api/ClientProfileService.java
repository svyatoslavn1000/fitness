package ru.gofit.services.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.gofit.dto.ClientProfileDto;

public interface ClientProfileService {

    /**
     * Найти все профили клиентов
     *
     * @param pageable количество страниц и количество профилей клиентов на странице
     * @return список профилей клиентов
     */
    Page<ClientProfileDto> getAll(Pageable pageable);

    /**
     * Найти профиль клиента по его идентификатору
     *
     * @param id идентификатор профиля клиента
     * @return профиль клиента
     */
    ClientProfileDto getById(Long id);

    /**
     * Создать профиль клиента
     *
     * @param clientProfileDto запрос с данными профиля клиента
     * @return новый профиль клиента, сохраненный в репозитории
     */
    ClientProfileDto save(ClientProfileDto clientProfileDto);

    /**
     * Изменить описание профиля клиента
     *
     * @param id                 профиль клиента
     * @param clientProfileDto изиененное описание профиля клиента
     * @return измененный профиль клиента, сохраненный в репозитории
     */
    ClientProfileDto update(Long id, ClientProfileDto clientProfileDto);

    /**
     * Удалить профиль клиента по его идентификатору
     *
     * @param id идентификатор профиля клиента
     */
    void deleteById(Long id);

    /**
     * Найти профиль клиента по его идентификатору клиента
     *
     * @param id идентификатор клиента
     * @return профиль клиента
     */
    ClientProfileDto getByUserId(Long id);
}
