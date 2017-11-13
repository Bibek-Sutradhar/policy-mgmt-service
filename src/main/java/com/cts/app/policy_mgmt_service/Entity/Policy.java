package com.cts.app.policy_mgmt_service.Entity;

import javax.persistence.*;

@Entity
@Table(name="POLICY")
public class Policy {

    @Id
    @Column(name="POLICY_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="POLICY_NAME")
    private String policyName;

    @Column(name="POLICY_DETAILS")
    private String policyDetails;

    @Column(name="IS_VALID")
    private String isValid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(String policyDetails) {
        this.policyDetails = policyDetails;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
