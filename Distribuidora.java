public class Distribuidora {

    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double pct_sp = (sp / total) * 100;
        double pct_rj = (rj / total) * 100;
        double pct_mg = (mg / total) * 100;
        double pct_es = (es / total) * 100;
        double pct_outros = (outros / total) * 100;

        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", pct_sp);
        System.out.printf("RJ: %.2f%%\n", pct_rj);
        System.out.printf("MG: %.2f%%\n", pct_mg);
        System.out.printf("ES: %.2f%%\n", pct_es);
        System.out.printf("Outros: %.2f%%\n", pct_outros);
    }

}

