public class Tributario {

    public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase) {
        return valorFaturamento * (aliquotaBase / 100.0);
    }

    public static double calcularImpostoProposto(double valorFaturamento, int aliquotaProposta) {
        return valorFaturamento * (aliquotaProposta / 100.0);
    }

    public static double calcularDiferenca(double impostoAntigo, double impostoProposto) {
        return Math.abs(impostoProposto - impostoAntigo);
    }

    public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
    }

    public static void main(String[] args) {
        double faturamento = 50_000_000.00;
        int aliquotaBase = 5;

        // Cenário 1: 9%
        int aliquotaProposta1 = 9;
        double impostoAntigo1 = calcularImpostoAntigo(faturamento, aliquotaBase);
        double impostoProposto1 = calcularImpostoProposto(faturamento, aliquotaProposta1);
        double diferenca1 = calcularDiferenca(impostoAntigo1, impostoProposto1);

        System.out.println("=== Cenário Proposta 1 (Alíquota 9%) ===");
        System.out.printf("Imposto Antigo: R$ %.2f%n", impostoAntigo1);
        System.out.printf("Imposto Proposto: R$ %.2f%n", impostoProposto1);
        System.out.printf("Diferença: R$ %.2f%n", diferenca1);

        // Cenário 2: 15%
        int aliquotaProposta2 = 15;
        double impostoAntigo2 = calcularImpostoAntigo(faturamento, aliquotaBase);
        double impostoProposto2 = calcularImpostoProposto(faturamento, aliquotaProposta2);
        double diferenca2 = calcularDiferenca(impostoAntigo2, impostoProposto2);

        System.out.println("\n=== Cenário Proposta 2 (Alíquota 15%) ===");
        System.out.printf("Imposto Antigo: R$ %.2f%n", impostoAntigo2);
        System.out.printf("Imposto Proposto: R$ %.2f%n", impostoProposto2);
        System.out.printf("Diferença: R$ %.2f%n", diferenca2);

       Tributario simulador = new Tributario();
        System.out.println("\n=== Análise de Diálogo Político ===");
        simulador.statusDialogo(true);
        simulador.statusDialogo(false);
    }
}