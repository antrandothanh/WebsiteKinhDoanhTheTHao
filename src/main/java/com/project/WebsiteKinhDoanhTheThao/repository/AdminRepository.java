package com.project.WebsiteKinhDoanhTheThao.repository;

import com.project.WebsiteKinhDoanhTheThao.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
