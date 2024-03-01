package stringMetodos;

public class EjemploStringTextRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        long inicio= System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(a);
        for (int i = 0 ; i<1000; i++){
            c= c.concat(a).concat(b).concat("\n");// 500 = 3ms 1000 = 8ms
            //c += a+ b + "\n"; // 500 = 17ms 1000 = 26ms
            //sb.append(a).append(b).append("\n"); // 500 = 0ms 1000 = 1ms

        }
        //garbage colector
        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);

    }
}
