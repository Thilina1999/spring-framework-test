package org.example;

public class Dev {

    private Computer com;

    public void setCom(Computer com) {
        this.com = com;
    }

    public void  compile(){
        System.out.println("Need");
        com.build();
    }

}
