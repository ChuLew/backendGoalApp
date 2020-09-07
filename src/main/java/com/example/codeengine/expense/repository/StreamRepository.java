package com.example.codeengine.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.codeengine.expense.model.Stream;

@Repository
public interface StreamRepository extends JpaRepository<Stream,Long>{

}
