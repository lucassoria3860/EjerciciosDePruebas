public class VolumenCilindro {
    public static void main(String[] args) {
        System.out.println("Este Programa Calcula el Volumen de un Cilindro");
        int radio;
        int altura;
        Double PI = 3.14;
        System.out.println("Ingrese el Radio del Cilindro");
        radio = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la Altura del Cilindro");
        altura = Integer.parseInt(System.console().readLine());
        System.out.println("El Volumen del Cilindro es: " + (PI * (radio + altura)));
    }
}
