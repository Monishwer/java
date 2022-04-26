import java.util.*;

interface libraryuser
{
void registeraccount(int a);
void requestbook(String a);

}

class kidusers implements libraryuser
{
int age;
String booktype;

public void registeraccount(int a)
{
age=a;
if(age<12)
{
System.out.println("Sorry,Age must be less than 12 to registrer as a kid..");
}
}

public void requestbook(String a)
{
booktype=a;
if(booktype =="kids")
{
System.out.println("Book Issued successfully,please return the book within 10 days..");
}
}
}

class adultusers implements libraryuser
{
int age;
String booktype;

public void registeraccount(int a)
{
age=a;
if(age>12)
{
System.out.println("You have successfully Registered under an Adult Account..");
}
else
{
System.out.println("Sorry, Age must be greater than 12 to register as an adult..");
}
}

public void requestbook(String a)
{
booktype =a;
if(booktype =="Fiction")
{
System.out.println("Book Issued successfully,please return the book within 7 days..");
}
else
{
System.out.println("Ooops,you are allowed to take any adult Fiction books..");
}
}
}

class libraryinterfacedemo
{

public static void main(String args[])
{
kidusers k=new kidusers();
adultusers a=new adultusers();
k.registeraccount(10);
k.registeraccount(18);
k.requestbook("kids");
k.requestbook("Fiction");
a.registeraccount(5);
a.registeraccount(23);
a.requestbook("kids");
a.requestbook("Fiction");
}
}