import java.util.*;
class BindString
{
    String s;
    String p="";
    Scanner sc=new Scanner(System.in);
    void removeSpace()
    {
        int i;int c=0;
        s=s+" ";String q="";
        for(i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                if(c>0)
                {
                    c=0;
                    p=p+" ";
                }
                p=p+ch;
            }
            
            else 
            c++;
            q=q+p;
            p="";
            
        
    }
    p=q;
}
    void bind()
    {
        s=p;int i;p="";int c=0;
        s=s.toLowerCase();
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            String k=st.nextToken();
            for(i=0;i<k.length();i++)
            {
                char ch=k.charAt(i);
                if(Character.isAlphabetic(ch)==true && c==0 )
                {
                    int a=ch;
                    a=a-32;
                    ch=(char)a;
                    p=p+ch;
                    
                    c++;
                }
                else if(Character.isAlphabetic(ch)==true)
                p=p+ch;
                else p=p+"*";
            }
            c=0;
           p=p+" ";                
      
            }
            System.out.println(p);
        }
        void main()
    {
        System.out.println("INPUT:");
        System.out.println("ENTER STRING:");
        s=sc.nextLine();
        s=s.trim();
        System.out.println("OUTPUT:");
        removeSpace();
        bind();
        
    }
}