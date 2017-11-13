package com.cts.app.policy_mgmt_service.repository;

import com.cts.app.policy_mgmt_service.Entity.Policy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyMgmtRepository extends CrudRepository<Policy, Integer> {

}
