package com.company.strategy;

public class Jump implements Strategy{
    @Override
    public void execute() {
        System.out.println("Jumping");
    }
}
