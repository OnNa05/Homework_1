package com.example.homework1.model;

public class Check {
    private String num13;
    public Check(String num13){
        this.num13 = num13;
    }
    public boolean checkLength() {
        if(num13.length() != 13){
            return true;
        }
        return false;
    }
    public String checkNum(){
        if(num13.equals("1111111111111") || num13.equals("2222222222222")){
            return "คุณเป็นผู้มีสิทธิเลือกตั้ง";
        }
        else{
            return "คุณไม่มีสิทธิเลือกตั้ง";
        }
    }
}

