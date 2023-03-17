public class Mathematics1{

    public   static int add(int a ,int b, int c) {
       return a+b+c;
   }
   
   
   public  int sub(int a ,int b) {
      return a-b;
   }
   
   
   public  int mul(int a ,int b) {
       return a*b;
   }
   
   
   public  int div(int a ,int b) {
       if (b==0)
           return -1;
       else
           return a/b;
   }
   
   
   public  int big(int a ,int b) {
       return a>b ? a : b;
   }
   
   
   public  int small(int a ,int b) {
       return a<b ? a : b;
   }
   
   
   public boolean isPrime(int a) {
       for(int i=2;i<=a/2;i++) {
           if(a%i==0)
               return false;
       } 
           return true;
       
   }
   
   
   public String getPrimes(int a) {
       String s="";
       for(int i=2;i<=a;i++) {
           boolean b=isPrime(i);
           if(b==true)
               s=s+i+" ";
       }
       return s;
   }
   
   
   public  String inBetweenPrimes(int a ,int b) {
       String s="";
         for(int i=a; i<=b;i++){
            boolean b1=isPrime(i);
          if(b1==true)
              s=s+i+" ";
         }
           return s;  
         }
   
   
    public boolean even(int a) {
       if(a%2==0)
           return true;
       else
         return false;
   }
   
   
   public  int factorial(int a) {
     int  fact=1;
       for(int i=1; i<=a;i++) {
           fact=fact*i;
       }
       return fact;
   }
   
   
   
   public  int sumofnums(int a) {
       int  sum=1;
         for(int i=1; i<=a;i++) {
             sum=sum+i;
         }
         return sum;
   }
   
   
   public String divisors(int a) {
       String s="";
       for(int i=1;i<=a/2;i++) {
           if(a%i==0)
               s=s+i+" ";
       }
       return s;
   }
       
   
   public int divisorsSum(int a) {
       int sum=0;
       for(int i=1;i<=a/2;i++) {
           if(a%i==0)
               sum=sum+i;
       }
       return sum;
   }
   
   
   public int sumofDigits(int a) {
       int sum=0;
       while(a>0)
       {
         int digit=a%10;
          sum=sum+digit;
           a=a/10;
       }
      return sum;
   }
   
   
   public static int revofNum(int a) {
       int rev=0;
       while(a>0)
       {
         int digit=a%10;
          rev=rev*10+digit;
           a=a/10;
       }
      return rev;
   }
   
   
   public boolean specialNum(int a) {
       int x=a%10;
       int y=a/10;
     int  z=(x+y)+(x*y);
       if(z==a)
           return true;
       else 
           return false;
   }
   
       public boolean perfectNum(int a) {
     int	  sum=0;
           for(int i=1;i<=a/2;i++) {
               if(a%i==0)
                   sum=sum+i;
           }
     if(sum==a)
         return true;
     else
         return false;
           }
       
       public String getPerfectNums(int a) {
           String s="";
          
           for(int i=1;i<=a;i++) {
               boolean b=perfectNum(i);
               if(b==true)
                   s=s+i+" ";
           }
           return s;
             }  
       
       
       public   boolean strong(int a) {
           int sum=0;
           int temp=a;
           while(a>0) {
               int d=a%10;
             int fact=factorial(d);
               sum=sum+d;
               a=a/10;
           }
           if(sum==temp)
               return true;
           else
               return false;   
               
       }
       
       
       public String getstrongs(int a) {
           String s="";
           for(int i=1;i<=a;i++) {
               boolean  b=strong(i);
               if(b==true)
                   s=s+i+" ";
           }
           return s;
       }
       
   
       public   String inBetweenstrongs(int a ,int b) {
           String s="";
           for(int i=a;i<=b;i++) {
               boolean b1=strong(i);
               if(b1==true)
                   s=s+i+" ";
           }
           return s;
           
       }
       public int noOfDigits(int a) {
           int count=0;
          while(a>0) {
              count++;
              a=a/10;
          }
          return count;
       }
       
       
       public boolean armStrong(int a) {
           int n=noOfDigits(a);
           int temp=a;
           int sum=0;
           while(temp>0) {
               int digit= temp%10;
               int p=1;
               for(int i=1;i<=n;i++) {
                   p=p*digit;
               }
               sum=sum+p;
               temp=temp/10;
           }
           if(sum==a)
               return true;
           else 
         return	  false;
       }
       
       
       public String getArmstrongs(int a) {
           String s="";
           for(int i=1;i<=a;i++)
           {
               boolean b=armStrong(i);
               if(b==true)
               s=s+i+" ";
           }
           return s;
       }
       
       
       public String inBetweenArmstrong(int a,int b) {
           String s="";
           for(int i=a;i<=b;i++)
           {
               boolean b1=armStrong(i);
               if(b1==true)
               s=s+i+" ";
           }
           return s;
       }
      
     
   
      
   
    }
   
   
