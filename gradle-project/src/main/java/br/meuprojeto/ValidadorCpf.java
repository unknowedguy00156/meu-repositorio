package br.meuprojeto;

public class ValidadorCpf {

    public static boolean validar(String cpf) {
        if (cpf == null) {
            return false;
        }
        String d = cpf.replaceAll("\\D", "");
        if (d.length() != 11 || d.chars().distinct().count() == 1) {
            return false;
        }
        return calcularDigito(d, 9) == d.charAt(9) - '0'
                && calcularDigito(d, 10) == d.charAt(10) - '0';
    }

    private static int calcularDigito(String d, int qtd) {
        int soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma += (d.charAt(i) - '0') * (qtd + 1 - i);
        }
        int resto = (soma * 10) % 11;
        return resto == 10 ? 0 : resto;
    }
}
