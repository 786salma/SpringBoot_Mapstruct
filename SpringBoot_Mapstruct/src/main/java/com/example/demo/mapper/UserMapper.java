package com.example.demo.mapper;

import org.mapstruct.InheritInverseConfiguration;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto1.UserDto;
import com.example.demo.model1.User;

@Mapper (uses=AddressMapper.class)
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	String a = new String("Mr/Ms.");


	@Mappings({@Mapping(target = "userId" , source = "id"),
	@Mapping (target = "dateOfBirth", dateFormat = "dd.MM.yyyy"),
	@Mapping (target = "fullName" , expression= "java(a+user.getFirstName()+user.getLastName())")})
	
	UserDto userToDto(User user);

	@InheritInverseConfiguration
	User dtoToUser (UserDto dto);


}