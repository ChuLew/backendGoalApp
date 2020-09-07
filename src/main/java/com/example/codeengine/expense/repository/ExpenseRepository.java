package com.example.codeengine.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.codeengine.expense.model.Expense;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long>{

}
