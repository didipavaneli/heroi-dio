import java.util.Scanner;

public class Heroi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Heroi!");
        String heroi = sc.next();
        System.out.println("digite o xp do Herói");
        int xp = sc.nextInt();
        String rank = getRank(xp);

        String mensagem = String.format("O Herói de nome %s está no nível de %s", heroi, rank);
        System.out.println(mensagem);

    }


        public static String getRank(int xp) {
            int xpRange = (xp >= 10001) ? 8 :
                    (xp >= 9001)  ? 7 :
                            (xp >= 8001)  ? 6 :
                                    (xp >= 7001)  ? 5 :
                                            (xp >= 5001)  ? 4 :
                                                    (xp >= 2001)  ? 3 :
                                                            (xp >= 1001)  ? 2 : 1;

            return switch (xpRange) {
                case 1 -> "Ferro";
                case 2 -> "Bronze";
                case 3 -> "Prata";
                case 4 -> "Ouro";
                case 5 -> "Platina";
                case 6 -> "Ascendente";
                case 7 -> "Imortal";
                case 8 -> "Radiante";
                default -> "Desconhecido";
            };
        }
    }
