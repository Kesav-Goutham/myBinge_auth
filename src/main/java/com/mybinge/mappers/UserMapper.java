package com.mybinge.mappers;

import com.mybinge.dtos.SignUpDto;
import com.mybinge.dtos.UserDto;
import com.mybinge.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
