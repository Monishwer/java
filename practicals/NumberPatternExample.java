class NumberPatternExample{

public void npattern(int num){

for(int i = 0; i< num; i++){

for(int j = 0; j <=i; j++){

System.out.print(j +" ");
}
System.out.println();
}

}
public static void main(String args[]){

NumberPatternExample n = new NumberPatternExample();
int num = 6;
n.npattern(num);
}
}