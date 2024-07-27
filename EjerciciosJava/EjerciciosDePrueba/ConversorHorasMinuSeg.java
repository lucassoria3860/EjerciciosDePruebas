public class ConversorHorasMinuSeg {
    public static void main(String[] args) {
        System.out.println("Este Progrma Comvierte La cantidad de Dias" + 
                    " Ingresados por teclado en Horas, Minutos y Segundos");
        int dias; 
        int horas;
        int minutos;
        System.out.println("Ingrese la Cantidad de Dias que Quiere " + 
                                "Convertir en Horas, Minutos y Segundos");
        dias = Integer.parseInt(System.console().readLine());
        if(dias >= 1){
            horas = dias * 24;
            System.out.println("Los Dias Convertidos en Horas son: " + horas);
            if(horas >= 24){
                minutos = horas * 60;
                System.out.println("Los Dias Convertidos en Minutos son: " + minutos);
                System.out.println("Los Dias Convertidos en Segundos son: " + (minutos * 60));
            }
        }
        
       
    }    
}
