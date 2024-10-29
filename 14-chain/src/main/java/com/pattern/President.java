package com.pattern;

public class President extends Approver{
    //董事长 500000审批额度

    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()<500000){
            System.out.println("董事长"+this.name+"审批采购单"+request.getNumber()+"金额"+request.getAmount()+",采购目的"+request.getPurpose());
        }else {
            successor.processRequest(request);
        }
    }
}
