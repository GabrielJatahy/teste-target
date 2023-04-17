import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Faturamento {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("faturamento.json"));
            JSONArray faturamento = (JSONArray) obj;

            double minimo = Double.MAX_VALUE;
            double maximo = Double.MIN_VALUE;
            double soma = 0;
            int dias_com_faturamento = 0;
            int dias_acima_media = 0;

            for (Object diaObj : faturamento) {
                JSONObject dia = (JSONObject) diaObj;
                double valor = Double.parseDouble(dia.get("valor").toString());
                if (valor < minimo) {
                    minimo = valor;
                }
                if (valor > maximo) {
                    maximo = valor;
                }
                soma += valor;
                if (valor > 0) {
                    dias_com_faturamento++;
                }
            }

            double media = soma / dias_com_faturamento;

            for (Object diaObj : faturamento) {
                JSONObject dia = (JSONObject) diaObj;
                double valor = Double.parseDouble(dia.get("valor").toString());
                if (valor > media) {
                    dias_acima_media++;
                }
            }

            System.out.println("Menor faturamento diário: " + minimo);
            System.out.println("Maior faturamento diário: " + maximo);
            System.out.println("Número de dias acima da média: " + dias_acima_media);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}