package com.kuartis.dev.postgresql.dao;

import com.kuartis.dev.postgresql.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface TeacherDAO extends CrudRepository<Teacher, UUID>{}
