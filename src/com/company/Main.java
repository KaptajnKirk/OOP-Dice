package com.company;

public class Main {

    Die dice = new Die();
    int ones = 0;
    int twos = 0;
    int threes = 0;
    int fours = 0;
    int fives = 0;
    int sixes = 0;


    public void roll100 () {
        for (int i = 0; i < 100; i++ ){
            switch (dice.rollDice()) {
                case 1:
                    ones++;
                    break;

                case 2:
                    twos++;
                    break;

                case 3:
                    threes++;
                    break;

                case 4:
                    fours++;
                    break;

                case 5:
                    fives++;
                    break;

                case 6:
                    sixes++;
                    break;
            }
        }
    }

    public void print () {
        roll100();
        System.out.println("Number of ones: " + ones);
        System.out.println("Number of twos: " + twos);
        System.out.println("Number of threes: " + threes);
        System.out.println("Number of fours: " + fours);
        System.out.println("Number of fives: " + fives);
        System.out.println("Number of sixes: " + sixes);
    }

    public static void main(String[] args) {

        Die die1 = new Die();

        die1.rollDice();
        System.out.println(die1.toString());
        Main obj = new Main();
        obj.print();
    }
}
