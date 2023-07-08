/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

/**
 * xd xdx xdd
 * @author diego
 */
public class Validar {
    public boolean verificarCedula(String cedula) {
        // Verificar longitud de la cédula
        if (cedula.length() != 10) {
            return false;
        }
        
        // Verificar que todos los caracteres sean dígitos
        if (!cedula.matches("\\d+")) {
            return false;
        }
        
        // Obtener los dígitos de la cédula
        int[] digitos = new int[10];
        for (int i = 0; i < 10; i++) {
            //Se transforma los digitos en enteros 
            digitos[i] = Character.getNumericValue(cedula.charAt(i));
        }
        
        // Verificar el décimo dígito
        int suma = 0;
        for (int i = 0; i < 9; i++) {
            int mult = digitos[i] * ((i % 2 == 0) ? 2 : 1);
            if (mult > 9) {
                mult -= 9;
            }
            suma += mult;
        }
        int verif = 10 - (suma % 10);
        if (verif == 10) {
            verif = 0;
        }
        
        return digitos[9] == verif;
    }
}
