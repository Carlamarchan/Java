package com.ironhack.mascotas.mappers;

import com.ironhack.mascotas.dtos.gato.GetGatoDto;
import com.ironhack.mascotas.entities.Gato;
import org.springframework.stereotype.Component;

@Component
public class GatoMapper {

    public GetGatoDto entityToGetGatoDto(Gato gato) {
        GetGatoDto gatoDto = new GetGatoDto();
        gatoDto.setId(gato.getId());
        gatoDto.setName(gato.getName());
        gatoDto.setAge(gato.getAge());
        gatoDto.setChipID(gato.getChipID());
        gatoDto.setImage(gato.getImage());
        return gatoDto;
    }
}
