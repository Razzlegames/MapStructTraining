# What?
http://mapstruct.org/

A quick and easy framework to Map Pojos, eliminate boiler plate and avoid high prescription costs from stress.

# Key Features

- Generates mapping code and eliminates tedious boilerplate code
- Auto maps app params with the same names
  - Any unknowns can be mapped with `@Mapping( target = "ownerType", source = "diffOwnerType")` and you can point to custom code for that field mapping, with `qualifiedByName = {"customMapMethod"}`
- Easy to use with Spring `@Mapper(componentModel="spring")` will annotate generated code to create `ComponentScan`-able beans for you.
- Easy to read
- Easy to inspect generated `Java` code to see what is actually happening (adding breakpoints etc).

# FAQ

- What about unmapped members? What happens?
  - You can decide if they should be `IGNORE`d, should post a build `WARN`ing, or cause a build `ERROR`, using the compiler argument `mapstruct.unmappedTargetPolicy` `{IGNOR | WARN | ERROR}`
- Where is the generated code?
  - This is configurable with compiler argument `-s $DIR`, but by default will be in `target/generated-sources/`

# Challenges

- IDE plugin needed for auto generation
  - But easy to work around by just manual `compile` from IDE
  - Note that you may need to `clean` then `compile` if you change any Mapper class names.
- Complex mapping cases may not have a direct struct to struct mapping available.
   - Can work around by passing entire top level source object with `"."` to a custom mapper
     - `@Mapping( target = "ownerType", source = ".", qualifiedByName = {"customMapMethod"})`
   - Or, you can use `@AfterMapping` for hairier mapping issues
     - http://mapstruct.org/documentation/stable/reference/html/#customizing-mappings-with-before-and-after 
     - It will be the last step for the mapper before returning the result. 
     - You basically do a manual mapping, for that field, in this case.
     
      ```java
      @AfterMapping
      protected void afterMap(ObjectMappingFrom from, @MappingTarget ObjectMappingTo) {
         // Do any mapping not easily handled by Mapstruct idioms
      }
      ```

# Exercise

- Map `Customer` to a `CustomerDto`
 - Many fields are automatically mapped with NO CODE needed!
- Get all tests in `CustomerToCustomerDtoMapperTest` to pass
- Ask lots of questions! :)
