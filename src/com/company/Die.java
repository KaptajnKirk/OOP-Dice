package com.company;

public class Die {
  private int faceValue;

  public void Die () {
    this.faceValue = rollDice();
  }

  public int rollDice () {
    return faceValue = (int) (Math.random()*6+1);
  }


  public String toString() {
    return "Die{" +
        "faceValue=" + faceValue +
        '}';
  }
}
