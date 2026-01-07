package exercici2.model;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private List<Integer> numberList;

    public NumberList() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number){
        numberList.add(number);
    }

    public List<Integer> getNumberList() {
        return numberList;
    }
}
