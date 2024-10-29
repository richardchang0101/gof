package com.pattern;

public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会"+this.name+"审批采购单"+request.getNumber()+"金额"+request.getAmount()+",采购目的"+request.getPurpose());
    }
}
