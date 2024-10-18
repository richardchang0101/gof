package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main06 {
    public static void main(String[] args) {
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1= LoadBalancer.getInstance();
        balancer2= LoadBalancer.getInstance();
        balancer3= LoadBalancer.getInstance();
        balancer4= LoadBalancer.getInstance();

        //判断服务器负载数是否相同
        if(balancer1==balancer2&&balancer3==balancer4&&balancer3==balancer2){
            System.out.println("负载均衡器具有唯一性");
        }

        //增加服务器
        balancer1.addServer("server1");
        balancer1.addServer("server2");
        balancer1.addServer("server3");
        balancer1.addServer("server4");

        //模拟客户端请求的分发，如果输出结果为同一个server，可以将i适当放大
        for (int i = 0; i < 100; i++) {
            String serverList = balancer1.getServerList();
            System.out.println(serverList);
        }
    }
}