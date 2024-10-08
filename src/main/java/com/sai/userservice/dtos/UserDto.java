package com.sai.userservice.dtos;

import com.sai.userservice.models.Role;
import com.sai.userservice.models.User;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UserDto {

    private String email;
    private Set<Role> roles = new HashSet<>();

    public static UserDto from(User user) {

        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setRoles(user.getRoles());

        return userDto;
    }
}