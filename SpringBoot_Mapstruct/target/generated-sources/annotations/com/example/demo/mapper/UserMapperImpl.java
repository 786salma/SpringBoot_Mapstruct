package com.example.demo.mapper;

import com.example.demo.dto1.UserDto;
import com.example.demo.model1.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-12-27T13:07:47+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    private final AddressMapper addressMapper = Mappers.getMapper( AddressMapper.class );

    @Override
    public UserDto userToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUserId( user.getId() );
        userDto.setUserScore( user.getUserScore() );
        if ( user.getDateOfBirth() != null ) {
            userDto.setDateOfBirth( new SimpleDateFormat( "dd.MM.yyyy" ).format( user.getDateOfBirth() ) );
        }
        userDto.setAddress( addressMapper.addressToDto( user.getAddress() ) );

        userDto.setFullName( a+user.getFirstName()+user.getLastName() );

        return userDto;
    }

    @Override
    public User dtoToUser(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getUserId() );
        try {
            if ( dto.getDateOfBirth() != null ) {
                user.setDateOfBirth( new SimpleDateFormat( "dd.MM.yyyy" ).parse( dto.getDateOfBirth() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        user.setUserScore( dto.getUserScore() );
        user.setAddress( addressMapper.dtoToAddress( dto.getAddress() ) );

        return user;
    }
}
