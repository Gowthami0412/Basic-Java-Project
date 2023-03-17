public class MathematicsDriver {
        public static void main(String[] args) {
            Mathematics1 m=new Mathematics1();
 
            System.out.println("Addition of 3 numbers");
            System.out.println(m.add(1, 2, 3));
 
            System.out.println("subtraction of  numbers");
            System.out.println(m.sub(10, 5));
 
            System.out.println("multiplication of two numbers");
            System.out.println(m.mul(5, 6));
 
            System.out.println("Divison of two numbers");
            System.out.println(m.div(10, 5));
 
            System.out.println("Biggest number");
            System.out.println(m.big(10,5));
            
            System.out.println("Smallest number");
            System.out.println(m.small(10, 5));
 
            System.out.println("prime or not");
            System.out.println(m.isPrime(10));
 
            System.out.println("Get primes");
            System.out.println(m.getPrimes(100));
 
            System.out.println("Between primes");
            System.out.println(m.inBetweenPrimes(50, 100));
 
            System.out.println("Even or not");
            System.out.println(m.even(10));
 
            System.out.println("factorial of a number");
            System.out.println(m.factorial(5));
 
            System.out.println("Divisors of a number");
            System.out.println(m.divisors(10));
 
            System.out.println("Sum of Divisors ");
            System.out.println(m.divisorsSum(10));
 
            System.out.println("Sum of digits of a number");
            System.out.println(m.sumofDigits(123445));
           
            System.out.println("Reverse of a number");
            System.out.println(m.revofNum(123456789));
           
            System.out.println("Special number or not");
            System.out.println(m.specialNum(45));
 
            System.out.println("Perfect number or not");
            System.out.println(m.perfectNum(6));
 
            System.out.println("Get perfect numbers");
            System.out.println(m.getPerfectNums(9000));
 
            System.out.println("Strong number or not");
            System.out.println(m.strong(153));
         
 
            System.out.println("to get strong numbers");
            System.out.println(m.getstrongs(200));
 
            System.out.println("in Between strong numbers");
            System.out.println(m.inBetweenstrongs(100, 1000 ));
 
              
            System.out.println("Arm Strong number or not");
            System.out.println(m.armStrong(153));
 
              
            System.out.println("To get Arm strong numbers");
            System.out.println(m.getArmstrongs(1000));
 
              
            System.out.println("To get in between arm strong numbers");
            System.out.println(m.inBetweenArmstrong(10, 1000));
        }
    }

