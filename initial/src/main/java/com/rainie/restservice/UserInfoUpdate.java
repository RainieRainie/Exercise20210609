package com.rainie.restservice;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class UserInfoUpdate {

    @Id
    @NotBlank(message = "Blank username forbidden")
    private String username;

    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private int age;
    private String gender;
    private String nationality;
    private List<String> tags;
    private String status;
    @EqualsAndHashCode.Exclude private String updated;

    public String getTags() {
        if (tags != null) {
            return tags.stream().collect(Collectors.joining(":"));
        } else {
            return null;
        }
    }

}
