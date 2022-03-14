 //Java Template

import java.util.*;
import java.io.*;

public class FindSquare{
    public static void main(String[] args) throws IOException{
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] str = new String[n];

        for(int i=0;i<n;i++)
            str[i] = sc.next();

        char chstr[][] = new char[n][m];


        //form a grid
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                    chstr[i][j] = str[i].charAt(j);
        }


        int r1=0,c1=0;
        boolean flag = true;
        //find the top left of B square
        for(int i=0;i<n && flag;i++){
            for(int j=0;j<m && flag;j++){
                if(chstr[i][j]=='B'){
                    r1 = i; c1 = j;
 
                    flag = false;
                    break;
                     
                }
            }
        }


        int r2 = r1,c2 = c1;
        while(r2<n && c2<m && chstr[r2][c2]!='W'){
            r2++;
            c2++;
        }

        System.out.println(((r1+1) + (r2+1))/2 +" "+ ((c1+1)+(c2+1))/2);





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