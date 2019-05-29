package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import pojos.Customer;
import pojos.CustomerDto;

@Mapper
public interface CustomerToCustomerDtoMapper {

    // TODO create a mapping from Customer to CustomerDto
    //     using: @Mapping(target = "fieldToSetInCustomerDto", source = "sourceFromCustomerDto")
    //
    // TODO Add any other needed `@Mapping`s
    //     Note: All fields with same name are auto mapped!
    @Mapping(target = "isoTimeCreated", source = "epocTimeCreated",
        qualifiedByName = {"mapEpocToIsoTime"})
    CustomerDto map(Customer customer);


    @Named("mapEpocToIsoTime")
    default String mapEpocToIsoTime(long epoc) {

        // TODO fix this!
        return null;
    }
}
