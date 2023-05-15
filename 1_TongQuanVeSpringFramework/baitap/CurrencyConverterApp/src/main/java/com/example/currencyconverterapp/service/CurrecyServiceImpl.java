package com.example.currencyconverterapp.service;

public class CurrecyServiceImpl implements ICurrencyService{
    @Override
    public double usdToVnd(double usd) {
        return  usd*23460;
    }
}
