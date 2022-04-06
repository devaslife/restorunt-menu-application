package com.example.restorunt;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<ListItem> getItems() {
        ArrayList<ListItem> items = new ArrayList<>();
        items.add(new ListItem("Main Dish", 40, "https://as2.ftcdn.net/v2/jpg/02/71/31/67/1000_F_271316783_omj1d9FUS7Z05XYwPHQRvl0uSf9I6k8l.jpg"));
        items.add(new ListItem("Pizza", 20, "https://as2.ftcdn.net/v2/jpg/02/98/87/93/1000_F_298879323_gFrlW8xudBsTBGZvOgO8hwhJJsbJYmO5.jpg"));

        items.add(new ListItem("Salads", 80, "https://as2.ftcdn.net/v2/jpg/02/71/76/93/1000_F_271769386_59q1Hprxji3SsO1QnMTtQOXNHUrqIUZE.jpg"));
        items.add(new ListItem("Desserts", 70, "https://as1.ftcdn.net/v2/jpg/03/01/97/86/1000_F_301978652_O0aPwap1JaEVaAhj3mIlbqNnJGmRyCzC.jpg"));

        items.add(new ListItem("Pasta", 90, "https://as2.ftcdn.net/v2/jpg/02/24/04/47/1000_F_224044744_TfajDnLLHxkYz0CZJXhqzFq3B7eU6hwQ.jpg"));
        items.add(new ListItem("Beverages", 15, "https://as2.ftcdn.net/v2/jpg/02/53/84/81/1000_F_253848138_pUbJZl7eQTyliX9qCF1E2lNzGojwTnN8.jpg"));
        items.add(new ListItem("Burgers", 22, "https://as2.ftcdn.net/v2/jpg/01/32/95/03/1000_F_132950396_hdm9A3tdxqDdbRpmkX7Cf0lkjgx21RuY.jpg"));

        items.add(new ListItem("Fries", 16, "https://as1.ftcdn.net/v2/jpg/01/70/27/56/1000_F_170275666_53KCP4IuiCQEZazFAdexaRmsl7BEMQwI.jpg"));

        items.add(new ListItem("Healthy Food", 5, "https://as2.ftcdn.net/v2/jpg/02/34/24/15/1000_F_234241545_L5VvQbW36l99rsvDCGATdSTuC8Zm8nPJ.jpg"));

        return items;
    }
}
