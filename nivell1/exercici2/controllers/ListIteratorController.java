package exercici2.controllers;

import exercici2.model.NumberList;

import java.util.ListIterator;

public class ListIteratorController {
    private final NumberList numberList, reversedNumberList;

    public ListIteratorController() {
        this.numberList = new NumberList();
        this.reversedNumberList = new NumberList();
    }

    public void run(){
        addNumbers();
        reversingNumberList();
        showList();
    }

    public void addNumbers(){
        numberList.addNumber(1);
        numberList.addNumber(2);
        numberList.addNumber(3);
        numberList.addNumber(4);
        numberList.addNumber(5);
    }

    public void showList(){
        System.out.println("Original list: " + numberList.getNumberList());
        System.out.println("Reversed list: " + reversedNumberList.getNumberList());
    }

    public void reversingNumberList(){
        ListIterator<Integer> iterator = numberList.getNumberList().listIterator(numberList.getNumberList().size());
        while(iterator.hasPrevious()){
            reversedNumberList.addNumber(iterator.previous());
        }
    }
}
