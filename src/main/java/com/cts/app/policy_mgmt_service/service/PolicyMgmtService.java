package com.cts.app.policy_mgmt_service.service;

import com.cts.app.policy_mgmt_service.Entity.Policy;
import com.cts.app.policy_mgmt_service.repository.PolicyMgmtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyMgmtService {

    Policy policyFromDb = null;

    @Autowired
    PolicyMgmtRepository policyMgmtRepository;


    public List<Policy> fetchAllPolicies() {
        return (List<Policy>) policyMgmtRepository.findAll();
    }

    public Policy fetchPolicyById(Integer policyId){
        return policyMgmtRepository.findOne(policyId);
    }

   /* public Policy createPolicy(Policy policy){
        return policyMgmtRepository.save(policy);
    }

    public void deletePolicy(Integer policyId){
        policyMgmtRepository.delete(policyId);
    }*/

    public Policy updatePolicy(Integer policyId, String policyName, String policyDetails){

        if (policyId != null) {

            policyFromDb = policyMgmtRepository.findOne(policyId);
        }


        System.out.println("data frm db"+ policyFromDb.getPolicyName());
        if(policyFromDb == null){
            Policy policy = new Policy();
            policy.setPolicyName("Edit Policy Name");
            policy.setPolicyDetails("Edit Policy Details");
            policy.setIsValid("Y");
        }else{
            policyFromDb.setPolicyName(policyName);
            policyFromDb.setPolicyDetails(policyDetails);
            policyFromDb.setIsValid("Y");
        }

        return policyMgmtRepository.save(policyFromDb);
    }

    public Policy addPolicy(String policyName, String policyDetails) {

        Policy policy = new Policy();
        policy.setPolicyName(policyName);
        policy.setPolicyDetails(policyDetails);
        policy.setIsValid("Y");

        return policyMgmtRepository.save(policy);
    }

}
