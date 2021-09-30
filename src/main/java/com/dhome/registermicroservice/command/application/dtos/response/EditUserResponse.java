package com.dhome.registermicroservice.command.application.dtos.response;

import lombok.Value;

@Value
public class EditUserResponse {
    private Long Id;
    private String Name;
    private String LastName;
    private Long Age;
    private Long DNI;
    private String Email;
    private String Password;
    private String Username;
    private String Address;
}
