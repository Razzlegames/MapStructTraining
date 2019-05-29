# What?
http://mapstruct.org/

A quick and easy framework to Map Pojos, eliminate boiler plate and avoid high prescription costs from stress.

# Key Features

- Generates mapping code and eliminates tedious boilerplate code
- Auto maps app params with the same names
- Easy to use with Spring `@Mapper(componentModel="spring")` will annotate generated code to create `ComponentScan`-able beans for you.
- Easy to read
- Easy to inspect generated `Java` code to see what is actually happening (adding breakpoints etc).

# Challenges

- IDE plugin needed for auto generation
 - But easy to work around by just manual `compile` from IDE

# Exercise

- Map `Customer` to a `CustomerDto`
 - Many fields are automatically mapped with NO CODE needed!
- Get all tests in `CustomerToCustomerDtoMapperTest` to pass
- Ask lots of questions! :)
