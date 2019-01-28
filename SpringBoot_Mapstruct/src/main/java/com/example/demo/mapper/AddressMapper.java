package com.example.demo.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demo.dto1.AddressDto;
import com.example.demo.model1.Address;




	@Mapper
	public interface AddressMapper {
		
		@Mappings({@Mapping(target = "street" , constant = "Gandhi Nagar"),
			@Mapping(target = "pin" , source = "pincode")
			})
		AddressDto addressToDto(Address address);

		@InheritInverseConfiguration
		Address dtoToAddress(AddressDto  dto);


	}


		

	


