package com.kuartis.dev.postgresql.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class Course extends EntityWithUUID{
    private String name;
    private int workload;
    private short rate;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_course_teacher"))
    private Teacher teacher;
}
