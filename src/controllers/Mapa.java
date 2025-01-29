package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        linkedhashMap();
        treeMap();
    }

    public void hashMap(){
        System.out.println("---HASHMAP---");
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);


        //Buscar llave
        System.out.println("Hay pera: "+mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: "+mapa.containsKey("Pera"));

        //Obtener valor
        System.out.println("Valor de pera es: "+mapa.get("Pera"));

        //Eliminar Item
        mapa.remove("Pera");
        System.out.println("Mapa despues de eliminar item: "+mapa);
    }

    public void linkedhashMap(){
        System.out.println("---LINKEDHASHMAP---");
        Map<String, Integer> mapa = new LinkedHashMap();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);


        //Buscar llave
        System.out.println("Hay pera: "+mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: "+mapa.containsKey("Pera"));

        //Obtener valor
        System.out.println("Valor de pera es: "+mapa.get("Pera"));

        //Eliminar Item
        mapa.remove("Pera");
        System.out.println("Mapa despues de eliminar item: "+mapa);
    }

    public void treeMap(){
        System.out.println("---TREEMAP---");
        Map<String, Integer> mapa = new TreeMap();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);


        //Buscar llave
        System.out.println("Hay pera: "+mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: "+mapa.containsKey("Pera"));

        //Obtener valor
        System.out.println("Valor de pera es: "+mapa.get("Pera"));

        //Eliminar Item
        mapa.remove("Pera");
        System.out.println("Mapa despues de eliminar item: "+mapa);
    }
}
