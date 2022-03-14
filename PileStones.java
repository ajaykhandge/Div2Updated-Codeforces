//Printing all the subsequence of arr whose sum is equal to k

import java.util.*;
import java.io.*;

public class PileStones{
    
        public static void main(String []args) throws IOException{

        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        String str  = sc.next();

        int ans = 0;

        int plussign = 0;
        int minussign = 0;

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);

            if(ch=='-' && plussign==0)
                continue;
            else if(ch=='-' && plussign>0)
                plussign--;
            else if(ch=='+')
                plussign++;

            
        }

    System.out.println(plussign);


         

    }
  static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }



}