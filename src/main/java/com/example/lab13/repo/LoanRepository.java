package com.example.lab13.repo;

import java.util.List;
import java.util.Optional;

import com.example.lab13.model.Loan;

public interface LoanRepository {
    void save(Loan loan);
    Optional<Loan> findById(String id);
    Optional<Loan> findActiveByIsbn(String isbn);
    List<Loan> findActiveByMember(String memberId);
}
