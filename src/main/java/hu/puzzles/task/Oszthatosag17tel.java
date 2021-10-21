package hu.puzzles.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. oldal, 2021. 1. korcsoport
 * Oszthatóság 17-el
 * kesz
 */
public class Oszthatosag17tel {

    private final List<Integer> processedNumbers = new ArrayList<>();

    public List<String> run(List<String> bemenet) {
        List<String> kimenet = new ArrayList<>();

        divide17(Integer.parseInt(bemenet.get(0)));
        kimenet.add(getResult());
        kimenet.add(processedNumbers.stream().map(Object::toString).collect(Collectors.joining(" ")));

        return kimenet;
    }

    private void divide17(int number){
        int lastNumber = number%10;
        int baseNumber = number/10;
        int nextNumber = baseNumber - (lastNumber * 5);
        if(nextNumber >= 0){
            processedNumbers.add(nextNumber);
        }
        if(nextNumber <= 0){
            return;
        }
        divide17(nextNumber);
    }

    private String getResult(){
        if(processedNumbers.size() > 0 && processedNumbers.get(processedNumbers.size()-1) % 17 == 0){
            return "IGEN";
        }
        return "NEM";
    }
}
