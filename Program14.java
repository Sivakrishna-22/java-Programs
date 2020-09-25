/* Program to demonstrate how to find the largest value using the ? operator */
class Program14
{
public static void main (String args []) {
int a=3,b=7,c=13,big=0;
big=(big>a)? big:a;
big=(big>b)? big:b;
big=(big>c)? big:c;
System.out.println("BIG="+big);
}
}
