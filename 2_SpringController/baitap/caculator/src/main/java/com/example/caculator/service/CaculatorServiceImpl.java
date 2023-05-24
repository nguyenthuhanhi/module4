package com.example.caculator.service;

public class CaculatorServiceImpl implements ICaculatorService{
    @Override
    public double caculator(double calculation1, double calculation2, String caculation) {
        switch (caculation){
            case "+":
                return calculation1+calculation2;
            case "-":
                return calculation1-calculation2;
            case "*":
                return calculation1*calculation2;
            case "/":
                return calculation1/calculation2;
        }
        return 0;
    }
}
