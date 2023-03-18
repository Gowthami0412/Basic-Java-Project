import java.util.Scanner;

public class MathematicsDriver {
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            Mathematics1 m=new Mathematics1();
            System.out.println("enter numbers");
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            System.out.println("Addition of 3 numbers");
            System.out.println(m.add(a, b, c));
            
            System.out.println("enter numbers for sub");
            int d=scan.nextInt();
            int e=scan.nextInt();
            System.out.println("subtraction of  numbers");
            System.out.println(m.sub(d, e));
 
            System.out.println("enter numbers for mul");
            int f=scan.nextInt();
            int g=scan.nextInt();
            System.out.println("multiplication of two numbers");
            System.out.println(m.mul(f, g));
 
            System.out.println("enter numbers for div");
            int h=scan.nextInt();
            int i=scan.nextInt();
            System.out.println("Divison of two numbers");
            System.out.println(m.div(h, i));
 
            System.out.println("enter numbers to find big");
            int j=scan.nextInt();
            int k=scan.nextInt();
            System.out.println("Biggest number");
            System.out.println(m.big(j,k));

            System.out.println("enter numbers for small");
            int l=scan.nextInt();
            int n=scan.nextInt();
            System.out.println("Smallest number");
            System.out.println(m.small(l, n));

            System.out.println("enter number to find prime");
            int prime=scan.nextInt();
            System.out.println("prime or not");
            System.out.println(m.isPrime(prime));
 
            System.out.println("enter number to get primes");
            int p=scan.nextInt();
            System.out.println("Get primes");
            System.out.println(m.getPrimes(p));
 
            System.out.println("enter numbers to get primes in between");
            int q=scan.nextInt();
            int r=scan.nextInt();
            System.out.println("Between primes");
            System.out.println(m.inBetweenPrimes(q, r));
 
            System.out.println("enter number to find even");
            int even=scan.nextInt();
            System.out.println("Even or not");
            System.out.println(m.even(even));

            System.out.println("enter number to find fact");
            int fact=scan.nextInt();
            System.out.println("factorial of a number");
            System.out.println(m.factorial(fact));

            System.out.println("enter number to get divisors");
            int div=scan.nextInt();
            System.out.println("Divisors of a number");
            System.out.println(m.divisors(div));
 
            System.out.println("enter number to get sum of divisors");
            int v=scan.nextInt();
            System.out.println("Sum of Divisors ");
            System.out.println(m.divisorsSum(v));
 
            System.out.println("enter number to get sum of dig");
            int w=scan.nextInt();
            System.out.println("Sum of digits of a number");
            System.out.println(m.sumofDigits(w));
           
            System.out.println("enter number to reverse");
            int rev=scan.nextInt();
            System.out.println("Reverse of a number");
            System.out.println(m.revofNum(rev));
           
            System.out.println("enter number to find special ");
            int spl=scan.nextInt();
            System.out.println("Special number or not");
            System.out.println(m.specialNum(spl));
 
            System.out.println("enter number to find perfect");
            int perfectno=scan.nextInt();
            System.out.println("Perfect number or not");
            System.out.println(m.perfectNum(perfectno));

            System.out.println("enter numbers to get perfect no");
            int x=scan.nextInt();
            System.out.println("Get perfect numbers");
            System.out.println(m.getPerfectNums(x));
 
            System.out.println("enter number to find strongno");
            int strong=scan.nextInt();
            System.out.println("Strong number or not");
            System.out.println(m.strong(strong));

            System.out.println("enter number to get strongno's");
            int u=scan.nextInt();
            System.out.println("to get strong numbers");
            System.out.println(m.getstrongs(u));
 
            System.out.println("enter number to get strong no in between");
            int y=scan.nextInt();
            int z=scan.nextInt();
            System.out.println("in Between strong numbers");
            System.out.println(m.inBetweenstrongs(y, z ));
 
            System.out.println("enter number to find armstrong");
            int arm=scan.nextInt();
            System.out.println("Arm Strong number or not");
            System.out.println(m.armStrong(arm));
 
            System.out.println("enter number to find armstrongs");
            int s=scan.nextInt();
            System.out.println("To get Arm strong numbers");
            System.out.println(m.getArmstrongs(s));
 
            System.out.println("enter number to find armstrong in between");
            int t=scan.nextInt();
            int o=scan.nextInt();
            System.out.println("To get in between arm strong numbers");
            System.out.println(m.inBetweenArmstrong(t,o));
        }
    }

