/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CoffeeMachine {
 private final WaterTank water = new WaterTank(1000);
 private final MilkTank milk = new MilkTank(800);
 private final  CoffeeBeansContainer beans = new CoffeeBeansContainer(250, 0);
 private final  CoffeeGrinder grinder = new CoffeeGrinder("soft", beans);
 private final WasteTank waste = new WasteTank(20);

  public void newLatteCoffee(String coffeeType, String coffeeSize,String GrindSize) {
      if(waste.getCapacity() == 0){
          JOptionPane.showMessageDialog(null,"You have to empty your waste tank first to make more coffee");
          return;
      }
    if (milk.getMilkCapacity() >= 40) {
      if (grinder.getGroundCoffee() < 10) {
          JOptionPane.showMessageDialog(null, "there is not much Ground coffee!! start grind some.");
        return;
      }
      Drink latte = new LatteCoffee(coffeeType, coffeeSize);
      latte.makeLatte(grinder, milk);
      latte.getLatteInfo(GrindSize);
      waste.updateWasteCapacity(1);
    } else {
        JOptionPane.showMessageDialog(null, "There is not much milk!, Start fill with some");
    }
  }

  public void newCoffeeCup(String coffeeType,String coffeeSize, String grindSize)   {
      if(waste.getCapacity() == 0){
          JOptionPane.showMessageDialog(null,"You have to empty your waste tank first to make more coffee");
          return;
      }
    try {
      if (water.getWaterCapacity() < 30 && coffeeSize.equals("single shot") && coffeeType.equals("Espresso")
          ||
          water.getWaterCapacity() < 60 && coffeeSize.equals("double shot") && coffeeType.equals("Espresso")
          ||
          water.getWaterCapacity() < 170 && coffeeSize.equals("single shot") && coffeeType.equals("Americano")
          ||
          water.getWaterCapacity() < 220 && coffeeSize.equals("double shot") && coffeeType.equals("Americano")
      ) {
          throw new Exception("""
               There is no much water! start fill with some.
               Your water tank capacity is only: """ + water.getWaterCapacity() + "  ml");
      }

      grinder.setGrindSize(grindSize);
      if (grinder.getGroundCoffee() < 7 && coffeeSize.equals("single shot")
          || grinder.getGroundCoffee() < 14 && coffeeSize.equals("double shot")) {
        JOptionPane.showMessageDialog(null, "there is no much Ground Coffee!! start grind some.");
        return;
      }
      coffeeMaker(coffeeType, coffeeSize, grindSize);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void coffeeMaker(String coffeeType, String coffeeSize, String GrindSize) {
    if (coffeeType.equals("Espresso")) {
      Drink espresso = new EspressoCoffee(coffeeType, coffeeSize);
      espresso.makeCoffee(grinder, water);
      espresso.getCoffeeInfo(GrindSize);
       waste.updateWasteCapacity(1);
    } else if (coffeeType.equals("Americano")) {
      Drink americano = new AmericanoCoffee(coffeeType, coffeeSize);
      americano.makeCoffee(grinder, water);
      americano.getCoffeeInfo(GrindSize);
      waste.updateWasteCapacity(1);
    }
  }

  public void grindCoffee(int Beans) {
    try {
      grinder.setGroundCoffee(Beans);
    } catch (InputMismatchException e) {
      System.out.println("The value must be an integer number!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void addWaterToTheTank() {
    try {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the amount of water that you to add in ml: ");
      int amountOfWater = input.nextInt();
      if (water.getWaterCapacity() + amountOfWater <= 1000) {
        water.setWaterCapacity(amountOfWater);
      } else {
        System.out.println("too much water! the maximum is 1 liter (1000ml)");
      }
    } catch (InputMismatchException e) {
      System.out.println("The value must be an integer number!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void addBeansToTheContainer() {
    try {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the amount of water that you to add in ml: ");
      int amountOfBeans = input.nextInt();
      if (beans.getBeansCapacity() + amountOfBeans <= 250) {
        beans.setBeansCapacity(amountOfBeans);
      } else {
        System.out.println("too much beans! the maximum is 250 g");
      }
    } catch (InputMismatchException e) {
      System.out.println("The value must be an integer number!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int GetWaterCapacity() {
      return water.getWaterCapacity();
  }

  public int GetBeansCapacity() {
      return beans.getBeansCapacity();
  }

  public int GetGroundPowder() {
      return grinder.getGroundCoffee();
  }

  public int GetMilkCapacity() {
      return milk.getMilkCapacity();
  }
  
  public  int GetWasteCapacity(){
      return waste.getCapacity();
  }
  
    public void SetWaterCapacity(int waterToAdd) {
       water.setWaterCapacity(waterToAdd);
  }

  public void SetBeansCapacity(int beansToAdd) {
       beans.setBeansCapacity(beansToAdd);
  }

  public void SetMilkCapacity(int milkToAdd) {
       milk.setMilkCapacity(milkToAdd);
  }
  
  public void SetWaste(int wasteReset){
      waste.setCapacity(wasteReset);
  }
}
