package org.example.lesson12;

import org.example.lesson12.configuration.BaseClass;
public class FirstRunBrowser extends BaseClass {
   static String mainUrl= "https://google.com"; /*тут вказуєм назву сайту*/
    public static void main(String[] args) {
        driver.get(mainUrl);
        System.out.println("Liudmyla Nikolaienko: "+mainUrl+", title: "+driver.getTitle()); /*тут виводим назву сайту в консоль*/
        driver.close();/*тут браузер закрили*/
    }
}