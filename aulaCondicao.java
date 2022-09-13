public class aulaCondicao {

    public static void main(String[] args) {
        int nota = 100;
        String graduacao;

        // // nota maior ou igual 70, então aprovado

        // if (nota >= 70) {
        // System.out.println("Aluno aprovado");
        // } else {
        // System.out.println("Aluno não aprovado");
        // }

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Não Aprovado");
                break;
            default:
                System.out.println("Graduação Inválida");
        }
    }
}
