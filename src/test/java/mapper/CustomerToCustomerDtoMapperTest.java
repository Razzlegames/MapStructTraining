package mapper;

import org.junit.Test;
import org.mapstruct.factory.Mappers;
import pojos.Customer;
import pojos.CustomerDto;

import java.time.Instant;

import static org.junit.Assert.assertEquals;

public class CustomerToCustomerDtoMapperTest {

    // TODO get this to pass by fixing the CustomerToCustomerDtoMapper interface :)
    @Test
    public void testCustomerMapping() {

        Customer customer = new Customer();
        customer.setAge(10);
        customer.setLocation("PHX_USA");
        customer.setName("Bob");
        customer.setEpocTimeCreated(0);
        customer.setCountryCode("USA");

        CustomerToCustomerDtoMapper mapper = Mappers.getMapper(CustomerToCustomerDtoMapper.class);
        CustomerDto customerDto = mapper.map(customer);

        assertEquals(String.valueOf(customer.getAge()), customerDto.getAge());
        assertEquals(customer.getLocation(), customerDto.getLocation());
        assertEquals(customer.getName()+ ":" + customer.getAge(), customerDto.getCombinationKeyOfNameAndAge());
        assertEquals(Instant.ofEpochSecond(customer.getEpocTimeCreated()).toString(),
            customerDto.getIsoTimeCreated());
        assertEquals(customer.getCountryCode(), customerDto.getCountry());
        assertEquals("someConstant", customerDto.getSomeConstant());
    }

}