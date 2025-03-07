package com.freelance.platform.freelance_platform.Models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users") // Renaming the table to avoid PostgreSQL conflict
public class User extends BaseUser {

    private String phoneNumber;
    private String address;
}
