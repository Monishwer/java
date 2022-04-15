class Bank{
int getRateOfInterest(){
return 0;
}
}
class SBI extends Bank{
int getRateOfInterest(){
return 8;
}
}
class ICICI extends Bank{
int getRateOfInterest(){
return 7;
}
}
class Axis extends Bank{
int getRateOfInterest(){
return 6;
}
}

class OverridingExample{
public static void main(String [] args){
SBI s = new SBI();
ICICI i = new ICICI();
Axis a = new Axis();

System.out.println("SBI rate of intrest : "+s.getRateOfInterest());
System.out.println("ICICI rate of intrest : "+i.getRateOfInterest());
System.out.println("Axis rate of intrest : "+a.getRateOfInterest());
}
}



