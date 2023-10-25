package bj.dgb.finances.domiciliation.payloads.requests;

import bj.dgb.finances.domiciliation.models.agent.ContactInfo;

import java.time.LocalDate;

public class AgentRequest {
    private String matricule;
    private String lastname;
    private String firstname;
    private String gender;
    private LocalDate birthdate;
    private ContactInfo contactInfo;
    private AddressRequest address;
}
