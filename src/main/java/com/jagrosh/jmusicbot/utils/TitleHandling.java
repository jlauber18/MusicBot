package com.jagrosh.jmusicbot.utils;

public class TitleHandling {
    public static String replaceTitle(String title) 
    {
        String betterTitle = title.replaceAll("\\(.*\\)", "").replaceAll("\\[.*\\]", "").replaceAll("\\{.*\\}", "");
        return betterTitle;
    }
}