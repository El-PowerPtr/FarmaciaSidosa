/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.aplicacion.logica.productos.Medicamento;
import org.example.aplicacion.logica.productos.Presentacion;
import org.example.aplicacion.logica.productos.Presentacion.Formato;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void MedicamentoFuncionaTest(){
        String nombreCientifico = "Aspirina 1-2-3";   
        Medicamento pruebaMedicamento = new Medicamento(nombreCientifico);
        
        assertEquals(pruebaMedicamento.getNombreCientifico(), nombreCientifico);
        
        System.out.println("El constructor de medicamentos funciona perfectamente");
    }

    @Test
    void presentacionFuncionaTest(){
        int fortaleza = 5;
        Presentacion presentacion = new Presentacion(Formato.PILDORA, fortaleza);

        assertEquals(fortaleza, presentacion.getFortalezaMg());
        assertEquals(Formato.PILDORA, presentacion.getFormato());

        System.out.println("El constructor de medicamentos funciona perfectamente");
    }
}
