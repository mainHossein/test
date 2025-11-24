package com.example.demo.repository;

import com.example.demo.model.Model;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<@NonNull Model, @NonNull Long> {
}
