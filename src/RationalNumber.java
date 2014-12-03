public class RationalNumber
{
  int num;
  int denom;

  //Constructors
  public RationalNumber()
  {
    num=0;
    denom=1;
  }
  
  public RationalNumber(int numerator, int denominator)
  {
    num=numerator;
    denom=denominator;
  }
  
  //Accssesors
  public int getDenominator()
  {
    return denom;
  }
  
  public int getNumerator()
  {
    return num;
  }
  
  public int GreatestCommonDivisor(int first, int second) 
    {
    int temp;
    while (second != 0) 
      {
      temp = second;
      second = first % second;
      first = temp;
      }        
    return first;
    }
  
  public String toString()
  {
    return (num+"/"+denom);
  }
  
  //Mutators
  public void add(RationalNumber frac)
  {
    int d2=frac.getDenominator();
    int n2=frac.getNumerator();
    int comDenom = denom*d2;
    num=num*d2;
    n2=n2*denom;
    d2=comDenom;
    denom=comDenom;
    num=num+n2;
    num=num/GreatestCommonDivisor(num, denom);
    denom=denom/GreatestCommonDivisor(denom, num);
  }
  
  public void subtract(RationalNumber frac)
  {
    int d2=frac.getDenominator();
    int n2=frac.getNumerator();
    int comDenom = denom*d2;
    num=num*d2;
    n2=n2*denom;
    d2=comDenom;
    denom=comDenom;
    num=num-n2;
    num=num/GreatestCommonDivisor(num, denom);
    denom=denom/GreatestCommonDivisor(denom, num);
  }
  
  public void multiply(RationalNumber frac)
  {
    int d2=frac.getDenominator();
    int n2=frac.getNumerator();
    int comDenom = denom*d2;
    num=num*d2;
    n2=n2*denom;
    d2=comDenom;
    denom=comDenom;
    num=num*n2;
    denom=denom*d2;
    num=num/GreatestCommonDivisor(num, denom);
    denom=denom/GreatestCommonDivisor(denom, num);  
  }
  
  public void divide(RationalNumber frac)
  {
    int d2=frac.getDenominator();
    int n2=frac.getNumerator();
    int comDenom = denom*d2;
    num=num*d2;
    n2=n2*denom;
    d2=comDenom;
    denom=comDenom;
    num=num*d2;
    denom=denom*n2;
    num=num/GreatestCommonDivisor(num, denom);
    denom=denom/GreatestCommonDivisor(denom, num);
  }
}
