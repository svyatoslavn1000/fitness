package ru.gofit.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gofit.dto.ClientProfileDto;
import ru.gofit.services.api.ClientProfileService;

import javax.validation.Valid;

@Api(tags = "Профиль клиента")
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/client_profile")
public class ClientProfileController {

    private final ClientProfileService clientProfileService;

    @ApiOperation("Запрос списка профилей клиентов")
    @GetMapping
    public Page<ClientProfileDto> getAll(Pageable pageable) {
        return clientProfileService.getAll(pageable);
    }

    @ApiOperation("Запрос профиля клиента по id профиля")
    @GetMapping("/{id}")
    public ClientProfileDto getById(@ApiParam(name = "id", value = "ID профиля клиента") @PathVariable Long id) {
        return clientProfileService.getById(id);
    }

    @ApiOperation("Запрос профиля клиента по id клиента")
    @GetMapping("/user/{id}")
    public ClientProfileDto getByUserId(@ApiParam(name = "id", value = "ID клиента") @PathVariable Long id) {
        return clientProfileService.getByUserId(id);
    }

    @ApiOperation("Создать профиль клиента")
    @PostMapping
    public ClientProfileDto save(@Valid @RequestBody ClientProfileDto clientProfileDto) {
        return clientProfileService.save(clientProfileDto);
    }

    @ApiOperation("Обновить профиль клиента")
    @PutMapping("/{id}")
    public ClientProfileDto update(@ApiParam(name = "id", value = "ID профиля клиента") @PathVariable Long id,
                                     @RequestBody ClientProfileDto clientProfileDto) {
        return clientProfileService.update(id, clientProfileDto);
    }

    @ApiOperation("Удалить профиль клиента")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@ApiParam(name = "id", value = "ID профиля клиента") @PathVariable Long id) {
        clientProfileService.deleteById(id);
        return ResponseEntity.accepted()
                .build();
    }
}
