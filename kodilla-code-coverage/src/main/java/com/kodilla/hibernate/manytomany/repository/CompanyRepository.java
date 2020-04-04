package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}