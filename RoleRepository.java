
package com.company.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.usermanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{}
