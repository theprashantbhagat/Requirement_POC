package com.bikkadIt.req_POC.repositories;

import com.bikkadIt.req_POC.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,String> {
}
