package by.bntu.fitr.povt.coffeebaby.controller;


import by.bntu.fitr.povt.coffeebaby.model.*;
import by.bntu.fitr.povt.coffeebaby.model.engines.ArrayQueue;
import by.bntu.fitr.povt.coffeebaby.model.engines.ArrayStack;
import by.bntu.fitr.povt.coffeebaby.model.engines.ListQueue;
import by.bntu.fitr.povt.coffeebaby.model.engines.ListStack;
import by.bntu.fitr.povt.coffeebaby.view.Inputer;
import by.bntu.fitr.povt.coffeebaby.view.View;
import by.bntu.fitr.povt.coffeebaby.model.StonesCalc;
import java.util.ArrayList;
import java.util.LinkedList;

public class Controller {
    public static void main(String[] args) {
        StoneMaster stoneMaster = new StoneMaster();
        int choice, countOfStones;
        View.output("Please, input number of stones in your necklace: ");
        countOfStones = Inputer.inputInt();
        Necklace necklace = new Necklace(new ArrayList());
        Mine mine = Mine.getMine();
        mine.extractionStone();
        necklace = stoneMaster.createNecklace(necklace, countOfStones);


       StonesCalc stonesCalc = new StonesCalc();
        while(true)
        {
            View.output("\nMenu:\n"
                    + "1.Output necklace\n"
                    +"2.Sorting stones by weigth\n"
                    +"3.Sorting stones by price\n"
                    +"4.Exit");
            choice = Inputer.inputInt();
            switch(choice){
                case 1:{
                    View.output(necklace+"");
                    break;
                }


                case 2:{
                    stonesCalc.sortStonesByWeigth(necklace);
                    View.output(necklace+"");
                    break;
                }

                case 3:{
                    stonesCalc.sortStonesByPrice(necklace);
                    View.output(necklace+"");
                    break;
                }
                case 4:{
                    System.exit(0);
                }

                break;
                default:
                    View.output("Error: Incorrect choise.");
            }

        }
    }

}
