package com.example.re_submit_lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[]args){
        Map<String ,List<String >> favoriteFoodForEach= new HashMap<>();

        List<String>tanakaFavoriteFood= new ArrayList<>();
        tanakaFavoriteFood.add("寿司");
        tanakaFavoriteFood.add("和牛");
        tanakaFavoriteFood.add("すき焼き");
        favoriteFoodForEach.put("田中",tanakaFavoriteFood);

        List<String>suzukiFavoriteFood = new ArrayList<>();
        suzukiFavoriteFood.add("明太子");
        suzukiFavoriteFood.add("博多ラーメン");
        suzukiFavoriteFood.add("通りもん");
        favoriteFoodForEach.put("鈴木",suzukiFavoriteFood);

        List<String>hayamaFavoriteFood =new ArrayList<>();
        hayamaFavoriteFood.add("そうめん");
        hayamaFavoriteFood.add("ケバブ");
        hayamaFavoriteFood.add("臭豆腐");
        favoriteFoodForEach.put("葉山",hayamaFavoriteFood);


        System.out.println("葉山さんの好きな食べ物は"+favoriteFoodForEach.get("葉山"));

        favoriteFoodForEach.remove("鈴木");

        for(String key:favoriteFoodForEach.keySet()){
            String str = favoriteFoodForEach.get(key).toString();
            System.out.println(key+"さんの好きな食べ物は"+str);
        }

        boolean containsSushi = favoriteFoodForEach.containsValue(tanakaFavoriteFood);
        System.out.println("寿司が好きな人がいますか？ " + containsSushi);

        List<String>prsWhoLikeRamen = new ArrayList<>();
        for(Map.Entry<String,List<String>>entry: favoriteFoodForEach.entrySet()){
            if(entry.getValue().contains("ラーメン")){
                prsWhoLikeRamen.add(entry.getKey());
            }
        }
        System.out.println("ラーメンが好きな人"+prsWhoLikeRamen+"さん");


    }
}
