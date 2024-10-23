package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("GKFFD");
        stringList.add("TNANA");
        stringList.add("MPMSL");
        stringList.add("PSWME");
        stringList.add("LZMLF");
        stringList.add("JYEBV");
        stringList.add("YELNT");
        stringList.add("JSNKR");
        stringList.add("JFESF");
        stringList.add("TMJLL");

        return stringList;

    }

    public static void printElementsAndIndex(List<String> customList) {
        for ( int i = 0; i < customList.size(); i++){
            String element = customList.get(i);
            System.out.println("Índice: " + i + ", Elemento: " + element);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();
        System.out.println("Lista original: " + myList);

        boolean result = addElementToList(myList, "AAAAA");
        if (result){
            System.out.println("Elemento 'AAAAA' añadido. ");
        }else{
            System.out.println("No se puedo añadie el elemento a la lista.");
        }

        System.out.println("Lista actualizada: " + myList);
        printElementsAndIndex(myList);
    }

}
