package lanz.global.companyservice.util.converter;

import java.util.List;

public interface BaseConverter<E, DTO> {

    DTO convertToDto(E entity);

    default List<DTO> convertFromList(List<E> entity) {
        return entity.stream()
                .map(this::convertToDto)
                .toList();
    }

}
