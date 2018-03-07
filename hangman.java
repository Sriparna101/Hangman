//Based on the theme WORD.
import java.util.*;
import java.io.*;
class Hangman
    {void main()throws IOException
        {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Scanner sc=new Scanner(System.in);
            System.out.println("You are to guess a movie name by
entering one character at a time. You get only 10 chances to guess the
name");
            String
a[]={"hulk","inception","annabelle","conjuring","black","gravity","spiderman","rio","kite","shrek","chef","cinderella","stella","gunday","bodyguard","dabangg","ring","haunted","ready","yaarian"};
            int n= ((int)( Math.random()*20)) + 1 ;
            String str=a[n];
                int l=str.length();
             char arr[]=new char[l];int count=0;
             for(int j=0;j<l;j++)
                    arr[j]='_';
           for(int i=1;i<=10;i++)
            {


                     for(int j=0;j<l;j++)
                    System.out.print(arr[j]+" ");
                    System.out.println();
                System.out.println("Enter character");
                 char ch=sc.nextLine().charAt(0);
                int c=0;
                for(int j=0;j<l;j++)
                {char ch1=str.charAt(j);
                    if(ch==ch1)
                    {arr[j]=ch1;
                        c++;count++;
                    }

                    }
                    if(c==0)
                    {
                        System.out.println("That was a loss.");
                    }

                    int s=0;
                    for(int k=0;k<l;k++)
                    if(arr[k]=='_')
                    s++;
                    if(s==0)
                    {System.out.print("Congratulations.You have
guessed the correct movie.");break;
                }
            }
                System.out.println();
                System.out.println("The movie was "+a[n]);

            System.out.println("Chances over");
        }
    }