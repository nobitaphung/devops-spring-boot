package com.example.review.mapper;

import com.example.review.entity.Review;
import com.example.review.dto.ReviewDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ReviewMapper {

    Review dtoToEntity(ReviewDto reviewDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Review updateNonNullValuesToEntity(ReviewDto dto, @MappingTarget Review entity);
}
