public class aulaBoolean {

    public static void main(String[] args) {
        boolean fimDeSemana = false;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        // Tabela Verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "é fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
