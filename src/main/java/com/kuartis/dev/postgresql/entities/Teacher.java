package com.kuartis.dev.postgresql.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends EntityWithUUID{
    private String name;
    private String pictureURL;
    private String email;   
}
