package br.meuprojeto;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidadorCpfTest {

    @Test
    void cpfValidoComEsemMascara() {
        assertTrue(ValidadorCpf.validar("529.982.247-25"));
        assertTrue(ValidadorCpf.validar("52998224725"));
    }

    @Test
    void cpfComDigitoVerificadorErrado() {
        assertFalse(ValidadorCpf.validar("529.982.247-24"));
    }

    @Test
    void cpfComTodosDigitosIguaisOuTamanhoErrado() {
        assertFalse(ValidadorCpf.validar("111.111.111-11"));
        assertFalse(ValidadorCpf.validar("123"));
        assertFalse(ValidadorCpf.validar(null));
    }
}
