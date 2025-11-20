public class Primes {
    public static void main(String[] args) {
    int num=Integer.parseInt(args[0]);
    boolean[] newP=primeAr(num);
    toPrint(newP);
    }
    public static void toPrint(boolean[] newP)
    {
    int count=0;
    System.out.println("Prime numbers up to "+(newP.length-1)+":");
    for(int i=0;i<newP.length;i++)
    {
        if(newP[i])
        {
            System.out.println(i);
            count++;

        }
    }
    int prec=(int)(((double)count/newP.length)*100);
    System.out.println("There are "+count+" primes between 2 and "+(newP.length-1)+" ("+prec+"% are primes)");
    }
    public static boolean[] newAr(int num)
    {
    boolean[] prime=new boolean[num];
    prime[0]=false;
    prime[1]=false;
    for(int i=2;i<prime.length;i++)
    {
        prime[i]=true;
    }
    return prime;
    }
    public static boolean[] primeAr(int num)
    {
        boolean[] newP= newAr(num+1);
        double sq=(int)Math.sqrt(newP.length);
        for(int i=2;i<=sq;i++)
        {
            if(newP[i])
            {
                divNum(newP,i);

            }
        }
        return newP;
    }
    public static void divNum(boolean[] newP, int num)
    {
        for(int i=num*num;i<newP.length;i+=num)
        {
            {
                newP[i]=false;
            }
        }
    }
    
}