/* Program implementing bitwise logical operators */
class BitLogicApp
{
public static void main(String args[])
{
int a = 30;
int b = 10;
int c = 3;
System.out.println("First Number: "+ a);
System.out.println("First Number: " + a);
System.out.println("A|B is:" + (a|b));
System.out.println("A & B is:" + (a&b));
System.out.println("A ^ B is:" + (a^b));
int d = ~c & 0x0f;
System.out.println("~c is :" + d);
}
}