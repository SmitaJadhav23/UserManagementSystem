
package com.company.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.usermanagement.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{}
