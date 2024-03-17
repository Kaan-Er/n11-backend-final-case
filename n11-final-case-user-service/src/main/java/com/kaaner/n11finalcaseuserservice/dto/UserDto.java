package com.kaaner.n11finalcaseuserservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String address;
    private double latitude;
    private double longitude;
}
