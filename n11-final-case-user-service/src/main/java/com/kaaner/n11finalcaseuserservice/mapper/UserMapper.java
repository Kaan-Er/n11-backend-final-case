package com.kaaner.n11finalcaseuserservice.mapper;

import com.kaaner.n11finalcaseuserservice.dto.UserDto;
import com.kaaner.n11finalcaseuserservice.entity.User;
import com.kaaner.n11finalcaseuserservice.request.UserSaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toUserDto(User user);
    User toUser(UserSaveRequest userSaveRequest);
}
