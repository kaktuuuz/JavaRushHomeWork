package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Toshiba on 6/28/2015.
 */
public class MoldovanHen extends Hen
{
    public String country= Country.MOLDOVA;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 15;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+this.country+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
