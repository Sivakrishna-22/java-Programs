class FreshJuice
{
   enum FreshJuiceSize{ SMALL,MEDIUM,LARGE }
   FreshJuiceSize size;	
}

class FreshJuiceTest
{
   public static void main(String args[])
   {
      FreshJuice juice = new FreshJuice();
      juice.size =  FreshJuice.FreshJuiceSize.LARGE;
      System.out.println("Size: "+juice.size);
   }
}

	