package com.example.lab13.repo.mem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.lab13.model.Loan;
import com.example.lab13.repo.LoanRepository;

public class InMemoryLoanRepository implements LoanRepository {
    private final Map<String, Loan> data = new HashMap<>();

    @Override
    public void save(Loan loan) {
        data.put(loan.getId(), loan);
    }

    @Override
    public Optional<Loan> findById(String id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public Optional<Loan> findActiveByIsbn(String isbn) {
        return data.values().stream()
                .filter(l -> l.getIsbn().equals(isbn) && l.isActive())
                .findFirst();
    }

    @Override
    public List<Loan> findActiveByMember(String memberId) {
        return data.values().stream()
                .filter(l -> l.getMemberId().equals(memberId) && l.isActive())
                .collect(Collectors.toList());
    }
}
