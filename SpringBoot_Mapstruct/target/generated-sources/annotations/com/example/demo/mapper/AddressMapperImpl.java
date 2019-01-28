package com.example.demo.mapper;

import com.example.demo.dto1.AddressDto;
import com.example.demo.model1.Address;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-12-27T13:07:47+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDto addressToDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setPin( address.getPincode() );

        addressDto.setStreet( "Gandhi Nagar" );

        return addressDto;
    }

    @Override
    public Address dtoToAddress(AddressDto dto) {
        if ( dto == null ) {
            return null;
        }

        Address address = new Address();

        address.setPincode( dto.getPin() );
        address.setStreet( dto.getStreet() );

        return address;
    }
}
