import java.util.*;
import java.io.*;


public class Infinity{

    public static void main(String[] args) throws Exception{

        FastScanner sc = new FastScanner();
        int n  = sc.nextInt();
        String[] str = new String[n];

        for(int i=0;i<n;i++)
            str[i] = sc.next();
        
        HashMap<String,String> hashmap = new HashMap<String,String>();
        hashmap.put("purple","Power");
        hashmap.put("green","Time");
        hashmap.put("blue","Space");
        hashmap.put("orange","Soul");
        hashmap.put("red","Reality");
        hashmap.put("yellow","Mind");

        for(String s: str){
            hashmap.remove(s);
        }

        System.out.println(hashmap.size());
        for(Map.Entry<String,String> map : hashmap.entrySet())
            System.out.println(map.getValue());



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