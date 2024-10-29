package com.pattern;

public class VicePresident extends Approver {
    //副董事长类 100000审批额度
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长"+this.name+"审批采购单"+request.getNumber()+"金额"+request.getAmount()+",采购目的"+request.getPurpose());
        }else{
            this.successor.processRequest(request);
        }
    }
}
