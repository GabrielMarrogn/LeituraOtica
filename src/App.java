import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        List<String> result = new ArrayList<>();

        while (true) {
            qtd = sc.nextInt();
            if (qtd == 0) {
                break;
            }

            for (int k = 0; k < qtd; k++) {
                List<String> color = new ArrayList<>();
                int resposta = 0;
                boolean blanco = false;
                boolean aceitavel = true;
                for (int i = 1; i <= 5; i++) {
                    int a = sc.nextInt();

                    if (a <= 127 && blanco == false) {
                        color.add("B");
                        resposta = i;
                        blanco = true;
                    } else if (a <= 127 && blanco == true) {
                        aceitavel = false;
                    }
                }

                if (aceitavel == true && resposta != 0) {
                    result.add(letra(resposta));
                }else {
                    result.add("*");
                }

            }
        }

        for (String p : result) {
            System.out.println(p);
        }

        sc.close();

    }

    public static String letra(int resposta) {
        String temp = new String();

        switch (resposta) {
            case 1:
                temp = "A";
                break;

            case 2:
                temp = "B";
                break;
            case 3:
                temp = "C";
                break;
            case 4:
                temp = "D";
                break;
            case 5:
                temp = "E";
                break;
        }

        return temp;
    }
}
