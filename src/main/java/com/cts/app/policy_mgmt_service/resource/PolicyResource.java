package com.cts.app.policy_mgmt_service.resource;

import com.cts.app.policy_mgmt_service.Entity.Policy;
import com.cts.app.policy_mgmt_service.repository.PolicyMgmtRepository;
import com.cts.app.policy_mgmt_service.service.PolicyMgmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyResource {

    @Autowired
    PolicyMgmtService policyMgmtService;

    @CrossOrigin
    @GetMapping("/all")
    public List<Policy> getAllPolicies(){
        return policyMgmtService.fetchAllPolicies();
    }

    @GetMapping("/policy/{policyId}")
    public Policy getPolicyById(@PathVariable ("policyId") Integer policyId){
        return policyMgmtService.fetchPolicyById(policyId);
    }

    /*@DeleteMapping("/policy/delete/{policyId}")
    public void deletePolicy(@PathVariable ("policyId") Integer policyId){
         policyMgmtService.deletePolicy(policyId);
    }

    @PostMapping("/policy/create")
    public Policy createPolicy(@RequestBody Policy policy){
        return policyMgmtService.createPolicy(policy);
    }*/

    @CrossOrigin
    @GetMapping("/policy/addOrUpdate")
    public Policy updatePolicy(@RequestParam ("id") Integer policyId, @RequestParam ("policyName") String policyName,
                                @RequestParam ("policyDetails") String policyDetails){


        return policyMgmtService.updatePolicy(policyId, policyName, policyDetails);
    }

    @CrossOrigin
    @GetMapping("/policy/addPolicy/{policyName}/{policyDetails}")
    public Policy addpolicy(@PathVariable ("policyName") String policyName,
                            @PathVariable ("policyDetails") String policyDetails){

        return policyMgmtService.addPolicy(policyName, policyDetails);

    }
}
