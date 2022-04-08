class pyramidPatternExample{

public void npattern(int num){

for(int i = 0; i< num; i++){

for(int j = 0; j <=i; j++){

System.out.print("*");
}
System.out.println();
}

}
public static void main(String args[]){

pyramidPatternExample n = new pyramidPatternExample();
int num = 6;
n.npattern(num);
}
}