import java.util.*;
// Vehicle
class Vehicle{
    String vehicleId;
    String vehicleType;
    public void EngineStart(int Num){
        System.out.println("ENgine start");
    }
    public Vehicle(String vehicleId,String vehicleType){
        this.vehicleId=vehicleId;
        this.vehicleType=vehicleType;
    }
}
//Ticket Generator
class Ticket{
    String vehicleId;
    int ticketId;
    int floor;
    int slot;
    long entryTime;
  public Ticket(String vehicleId,int ticketId,int floor ,int slot ){
    this.vehicleId=vehicleId;
    this.ticketId=ticketId;
    this.floor=floor;
    this.slot=slot;
    this.entryTime=System.currentTimeMillis();
  }
}



class ParkingLot{
    int floor=2;
    int slot=3;
    List<PriorityQueue<Integer>> carSlot= new ArrayList<>();
    List<PriorityQueue<Integer>> bikeSlot= new ArrayList<>();
    HashMap<String,Ticket> activeTicket=new HashMap<>();

//car and bike slot creation  
  public ParkingLot() { for(int i=0;i<floor;i++){
        PriorityQueue<Integer> carPq= new PriorityQueue<>();
        PriorityQueue<Integer> bikePq=new PriorityQueue<>();
        for(int j=0;j<slot;j++){
           carPq.add(j+1);
           bikePq.add(j+1);
        }
        carSlot.add(carPq);
        bikeSlot.add(bikePq);
    }}
     
int TicketNumber=0;
//Parking Function 
     public  void park(Vehicle vehicle){
         
            if(vehicle.vehicleType.equals("car")){
                for(int i=0;i<floor;i++){
                    if(!carSlot.get(i).isEmpty()){
                        int flr=i+1;
                        int slt=carSlot.get(i).poll()+1;
                        Ticket ticket= new Ticket(vehicle.vehicleId,TicketNumber++,flr,slt);
                        
                        System.out.println("Vehicle Id : "+vehicle.vehicleId);
                        System.out.println("vehicle Type" +vehicle.vehicleType);
                        System.out.println("Floor "+flr);
                        System.out.println("Ticket Id "+TicketNumber);
                        activeTicket.put(vehicle.vehicleId,ticket);
                    }

                    else{
                System.out.println("No slot available to park");
            }

            return;


                }
            }
           else if(vehicle.vehicleType.equals("bike")){
                for(int i=0;i<floor;i++){
                    if(!bikeSlot.get(i).isEmpty()){
                        int flr=i+1;
                        int slt=bikeSlot.get(i).poll()+1;
                        Ticket ticket= new Ticket(vehicle.vehicleId,TicketNumber++,flr,slt);
                        // activeTicket.add(vehicle.vehicleId);
                        System.out.println("Vehicle Id :"+vehicle.vehicleId);
                        System.out.println("vehicle Type"+vehicle.vehicleType);
                        System.out.println("Floor"+flr);
                        System.out.println("Ticket Id"+TicketNumber);
                        activeTicket.put(vehicle.vehicleId,ticket);
                    }
                    else{
                System.out.println("No slot available to park");
            }
                }
            }
            else{
                System.out.println("Inlegal entry");
            }
            
         }

         public void unpark()
       
    
}
public class Main{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vehicle type");
        String tp=sc.nextLine();
        System.out.println("Enter the vehicle Id");
        String id=sc.nextLine();
        Vehicle vehicle= new Vehicle(id,tp);
        ParkingLot lot=new ParkingLot();
        lot.park(vehicle);
    }
}