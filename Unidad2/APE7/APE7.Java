import java.util.Scanner;
public class APE7 {
    public static void main(String[] args) {

//DESCRIPCIÓN DE PASOS A SEGUIR:
//1. Definir las constantes simbolicas (porcentajes de cada evaluacion y nota minima para aprobar).
//2. Leer las tres notas del estudiante (individual, trabajo grupal y evaluacion final).
//3. Validar que las tres notas esten entre 0 y 10.
//4. Calcular la nota final aplicando los porcentajes (30%, 30% y 40%).
//5. Clasificar el rendimiento (Excelente, Muy bueno, Bueno, Regular o Deficiente).
//6. Determinar el estado academico (Aprobado o Reprobado).
//7. Mostrar por pantalla los resultados y los mensajes segun la nota final.
final float PESO_INDIVIDUAL = 0.30f;
final float PESO_GRUPAL = 0.30f;
final float PESO_FINAL = 0.40f;
final int NOTA_APROBACION = 7;
//Lectura de datos del estudiante
float nota_individual ;
float trabajo_grupal ;
 float evaluacion_final ;
float nota_final = 0.0f ;
String rendimiento = "";
String estado = "";
Scanner entrada = new Scanner(System.in);

System.out.print("Ingrese la nota individual: ");
nota_individual = entrada.nextFloat();

System.out.print("Ingrese la nota del trabajo grupal: ");
trabajo_grupal = entrada.nextFloat();

System.out.print("Ingrese la nota de la evaluacion final: ");
evaluacion_final = entrada.nextFloat();

//Validacion de las notas (deben estar entre 0 y 10)
if ((nota_individual >= 0) && (nota_individual <= 10) &&
(trabajo_grupal >= 0) && (trabajo_grupal <= 10) &&
(evaluacion_final >= 0) && (evaluacion_final <= 10)) {

//Calculo de la nota final
nota_final = (nota_individual * PESO_INDIVIDUAL) +
(trabajo_grupal * PESO_GRUPAL) +
(evaluacion_final * PESO_FINAL);

//Clasificacion del rendimiento (condicional multiple)
if (nota_final >= 9) {
rendimiento = "Excelente";
}
else if (nota_final >= 8) {
rendimiento = "Muy bueno";
}
else if (nota_final >= 7) {
rendimiento = "Bueno";
}
else if (nota_final >= 5) {
rendimiento = "Regular";
}
else {
rendimiento = "Deficiente";
}

//Estado academico (condicional doble)
if (nota_final >= NOTA_APROBACION) {
estado = "Aprobado";
}
else {
estado = "Reprobado";
}

//Mostrar los resultados por pantalla
System.out.println("--- CALCULO DE NOTA FINAL ---");
System.out.println("La nota final es: " + nota_final);
System.out.println("Rendimiento: " + rendimiento);
System.out.println("Estado: " + estado);
//Mensajes adicionales (condicionales simples)
if(nota_final < NOTA_APROBACION) {
System.out.println("El estudiante requiere refuerzo academico");
}

if (nota_final >= 9) {
System.out.println("¡Felicitaciones! Rendimiento sobresaliente");
}

}
else {
//si alguna nota esta fuera del rango permitido
System.out.println("Notas no validas: deben estar entre 0 y 10");
}

entrada.close();
}
}
