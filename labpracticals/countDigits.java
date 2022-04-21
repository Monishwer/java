class countDigits{

public static void main(String args[]){

int num = 123456;
int count = 0;

while(num > count){
num = num/ 10;
count++;
}
System.out.println("number of digits : "+count);
}
}