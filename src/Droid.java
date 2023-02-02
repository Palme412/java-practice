public class Droid{
    String name;
    int battery;
    String task;
  
    public Droid(String droidName, int batteryLevel){
      name = droidName;
      battery = batteryLevel;
      battery = 100;
    }
  
    public String toString(){
      return "Hello, I'm the droid: "+name;
    }
  
    public void performTask(String task){
      System.out.println(name + " is performing task:" + task);
      battery = battery - 10;
    }
  
    public void energyReport(){
      System.out.println(battery);
    }
  
    public static void main(String[] args){
    //   Droid codey = new Droid("Codey", 100);
    //   System.out.println(codey);
    //   codey.performTask(" writing code");
    //   codey.energyReport();
      Droid leanne = new Droid("Leanne", 100);
      leanne.performTask(" Be a fookis");
      leanne.energyReport();
    }
  }