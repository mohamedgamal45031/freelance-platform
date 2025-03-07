package com.freelance.platform.freelance_platform.Models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Freelancer extends User {

    private String specialization;
}
