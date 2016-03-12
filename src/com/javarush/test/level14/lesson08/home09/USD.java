package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Toshiba on 6/29/2015.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
