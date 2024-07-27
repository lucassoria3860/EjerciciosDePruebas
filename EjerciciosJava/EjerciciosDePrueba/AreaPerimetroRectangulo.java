public class AreaPerimetroRectangulo{
    public static void main (String[] args){
        System.out.println("Este programa Calcula el Area y" + 
                                " el Perimetro de un Rectangulo");
        int base;
        int altura;
        System.out.println("ingrese la Base del Rectangulo");
        base = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la Altura del rectangulo");
        altura = Integer.parseInt(System.console().readLine());
        System.out.println("El Area del Rectangulo es: " + (base * altura));
        System.out.println("El Perimetro del Rectangulo es: " + ((altura * 2) * base));
    }
}