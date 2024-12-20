package org.gcu.milestone.model.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class UserModel
{
    private String username;
    private String password;
}
