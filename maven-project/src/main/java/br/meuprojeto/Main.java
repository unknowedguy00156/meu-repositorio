package br.meuprojeto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String cpf = args.length > 0 ? args[0] : "529.982.247-25";

        Map<String, Object> resultado = new LinkedHashMap<>();
        resultado.put("cpf", cpf);
        resultado.put("valido", ValidadorCpf.validar(cpf));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(resultado));
    }
}
