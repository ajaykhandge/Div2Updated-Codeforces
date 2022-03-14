import java.util.*;
import java.io.*;

class ScarboroughFair{

    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();   //initial string
        
        while(m-->0){
        int l = sc.nextInt();
        int r = sc.nextInt();
        String c1 = sc.next();
        String c2 = sc.next();

        char strarray[] = str.toCharArray();

        for(int i=l;i<=r;i++){
             if(strarray[i-1]==c1.charAt(0))
                   { strarray[i-1] = c2.charAt(0);
                  
                   }
        }

        str = String.valueOf(strarray);

        }

        System.out.println(str);



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

