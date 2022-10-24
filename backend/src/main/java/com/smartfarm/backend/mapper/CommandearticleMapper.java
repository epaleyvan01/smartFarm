package com.smartfarm.backend.mapper;

import com.smartfarm.backend.model.dto.CommandearticleDto;
import com.smartfarm.backend.model.entities.Commandearticle;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy =  NullValueCheckStrategy.ALWAYS)
public interface CommandearticleMapper {
    Commandearticle toEntity(CommandearticleDto commandearticleDto);

    CommandearticleDto toDto(Commandearticle commandearticle);

    void copy(CommandearticleDto commandearticleDto, @MappingTarget Commandearticle commandearticle);
}
