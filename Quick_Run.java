import java.util.Scanner;

class QuickFind {
    private int[] id;

    public QuickFind(int N) {
         id = new int[N];
         for(int i=0; i<N ; i++) {
             id[i] = i;
         }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p,int q) {
        int pid = id[p];
        int qid = id[q];
        for(int i =0; i<id.length ; i++) {
            if(id[i] == pid) 
            id[i] = qid;
        }
    }
}


class Quick_Run {
    public static void main(String args[]) {

        QuickFind obj = new QuickFind(10);

        try (Scanner myscan = new Scanner(System.in);) {
            
            System.out.println("Enter the p and q value");
            int p = myscan.nextInt();

            int q = myscan.nextInt();

            obj.union(p,q);

            boolean a2;
            System.out.println("Enter the p and q value to see whether they are connected");
            int a = myscan.nextInt();

            int b = myscan.nextInt();
       
        a2 = obj.connected(a,b);
        System.out.println("The value is "+ a2);
        } catch (Exception ex) {
            ex.printStackTrace();
    }
     
}
}
