abstract class Vehicle{
  abstract void drive();
  abstract void getout();
  public void  start(){
    System.out.print("Engine start");
  }
}
class Car extends Vehicle{
    public void drive(){
       System.out.print("Driving a car");

    }
    public void getout(){
            System.out.print("get ouut from car");

    }

}
class Abstraction{
    public static void main(String[] args){
       Car car = new Car();
       car.drive(); 
    }
}