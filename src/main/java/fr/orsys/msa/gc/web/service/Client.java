package fr.orsys.msa.gc.web.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private Integer id;

    @JsonProperty(value="last_name")
    private String lastname;

    @JsonProperty(value="first_name")
    private String firstname;
    private String address;
    private String city;
    private String zipCode;

}
