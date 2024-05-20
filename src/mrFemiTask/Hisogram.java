package mrFemiTask;

public class Hisogram {

    public static boolean hisogram(String word) {
      String alphabet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
      if(word.contains(alphabet))return true;
      return false;
    }
}
