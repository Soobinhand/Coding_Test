package BOJ.Sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder[] sb = new StringBuilder[201];

        for(int i=0;i<sb.length;i++){
            sb[i] = new StringBuilder();
        }
        for(int i=0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            sb[age].append(age).append(' ').append(name).append('\n');
        }
        StringBuilder sbb = new StringBuilder();
        for(StringBuilder v : sb)
            sbb.append(v);
        System.out.println(sbb);

    }
}
