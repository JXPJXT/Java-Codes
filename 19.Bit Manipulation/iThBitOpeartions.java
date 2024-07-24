public class iThBitOpeartions{
    public static int getIthBit(int n,int i){
      int bitMask = 1<<i;;
      if((n&bitMask)==0){
        return 0; 
      }
      else{
        return 1;
      }

    }
    public static int setIthBit(int n,int i){
      int bitMask=1<<i;
      return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
      int bitMask=~(1<<i);
        return n&bitMask;
    
    }
    public static int clearLastIBit(int n,int i){
      int bitMask = (~0)<<i;
      return n & bitMask;
    }
    public static int ClrIthRangeOfBits(int n,int i,int j){
      int a = ((~0)<<(j+1));
      int b =(1<<i)-1;
      int bitMask = a|b;
      return n & bitMask; 
    }
    public static boolean ChkPowTwo(int n){
      return (n&(n-1))==0;
    }
    public static int CountSetBits(int n){
      int count =0;
      while(n>0){
        if((n&1)!=0){//check lsb
          count++;
        }
        n=n>>1;
      }
      return count;
    }
    public static int FastExponentiation(int a,int n){
      int ans = 1;
      while(n>0){
        if((n&1)!=0){//CheckLsb
          ans = ans*a;
        }
        a = a*a;
        n=n>>1;
      }
      return ans;
    }

  public static void main(String[] args) {
        System.out.println(getIthBit(15, 2));
        System.out.println(getIthBit(13, 6));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10,1));
        System.out.println(clearLastIBit(15, 2));
        System.out.println(ClrIthRangeOfBits(10, 2, 4));
        System.out.println(ChkPowTwo(4));
        System.out.println(ChkPowTwo(5));
        System.out.println(CountSetBits(10));
        System.out.println(FastExponentiation(5,3 ));
}}