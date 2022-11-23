package com.kuartis.dev.postgresql.dao;

import com.kuartis.dev.postgresql.entities.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface CourseDAO extends CrudRepository<Course, UUID>{}
