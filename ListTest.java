import java.util.*;
import java.util.Scanner;
public class ListTest
{
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		int ch,ch1,item,pos;
		Scanner in=new Scanner(System.in);
		do
		{
			System.out.println("**Linked List Menu**");
			System.out.println("1.Insertion");
			System.out.println("2.Delation");
			System.out.println("3.Display");
			System.out.println("4.Size of Linked List");
			System.out.println("5.Exit");
			System.out.println("enter your choice");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:      do
					{
						System.out.println("**Insertion Menu**");
						System.out.println("1.Insertion at First");
						System.out.println("2.Insertion at Last");
						System.out.println("3.Insertion at Position");
						System.out.println("4.Exit");
						System.out.println("enter your choice");
					                 ch1=in.nextInt();
					                 switch(ch1)
						{
							
						case 1:System.out.println("Enter Inserted Element");
						           item=in.nextInt();	
						           list.addFirst(item);
				           		           break;
						case 2:System.out.println("Enter Inserted Element");
						           item=in.nextInt();
						           list.addLast(item);
				           		           break;
						case 3:System.out.println("Enter Position to insert");
						           pos=in.nextInt();
						           System.out.println("Enter Inserted Element");
						           item=in.nextInt();
						           list.add(pos,item);
				           		           break;
						}
					}while(ch1<=3);
					break;
			case 2:     do
				{
					System.out.println("**Deletion Menu**");
					System.out.println("1. Deletionat First");
					System.out.println("2. Deletion at Last");
					System.out.println("3. Deletion at Position");
					System.out.println("4.Exit");
					System.out.println("enter your choice");
				                 ch1=in.nextInt();
				                 switch(ch1)
					{
						case 1:if(list.isEmpty()==true)
			                                                               System.out.println("Linked List is Empty");
						           else
						           	System.out.println("Deleted Element"+list.removeFirst());
						           break;
						case 2 :if(list.isEmpty()==true)
			                                                               System.out.println("Linked List is Empty");
						           else
						           System.out.println("Deleted Element"+list.removeLast());
						           break;
						case 3:if(list.isEmpty()==true)
						              {
			                                                                      System.out.println("Linked List is Empty");
						               }
						                else
						               {
						                  System.out.println("Enter Position to Deleted ");
							 pos=in.nextInt();
							 System.out.println("Deleted Element"+list.remove(pos));
						               }
						                 break;
						}
					}while(ch1<=3);
					break;
				case 3:if(list.isEmpty()==true)
			                                                               System.out.println("Linked List is Empty");
						           else
						           System.out.println("linked list Elements"+list);
						           break;
				case 4:int size=list.size();
				           System.out.println("Linked list size"+size);
				           break;
			}
		}while(ch<=4);
	}
}
			
						           
							
			
					