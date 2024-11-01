package com.grepp.nbe1_2_team09.controller.location.dto;

import com.grepp.nbe1_2_team09.domain.entity.Location;

import java.math.BigDecimal;

public record CreateLocationRequest(
         String placeId,
         String placeName,
         BigDecimal latitude,
         BigDecimal longitude,
         String address,
         BigDecimal rating,
         String photo) {

    //DTO->Entity
    public Location toEntity(){
        return Location.builder()
                .placeId(placeId)
                .placeName(placeName)
                .latitude(latitude)
                .longitude(longitude)
                .address(address)
                .rating(rating)
                .photo(photo)
                .build();

    }
}
