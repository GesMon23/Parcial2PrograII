package parcial;
import java.util.Scanner;
public class Taller {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        Vehículo vehiculo[]= new Vehículo[5];
        for(int i=0;i<5;i++){
            vehiculo[i]=new Vehículo();
        }
        System.out.println(" SISTEMA DE TALLER MECANICO");
        System.out.println("---REGISTRO DE VEHICULOS---");
        System.out.println("Presione enter para continuar...");
        for(int a=0;a<5;a++){
            leer.nextLine();
            System.out.println("REGISTRO VEHICULO NO."+(a+1));
            System.out.println("Ingresa la Marca del Vehiculo");
            vehiculo[a].setMarca(leer.nextLine());               
            System.out.println("Ingresa el modelo del vehiculo");
            vehiculo[a].setModelo(leer.nextLine());
            System.out.println("Ingresa el color del Vehiculo");
            vehiculo[a].setColor(leer.nextLine());
            System.out.println("Ingresa la placa del Vehiculo");
            vehiculo[a].setPlaca(leer.nextLine());
            System.out.println("Ingresa el Año de Fabricación del Vehículo");
            vehiculo[a].setAño_Fab(leer.nextInt());
            System.out.println("\n");
        }
        for(int c=0;c<5;c++){
            System.out.println("Vehiculo No."+(c+1));
            System.out.println("Marca: "+vehiculo[c].getMarca());
            System.out.println("Modelo: "+vehiculo[c].getModelo());
            System.out.println("Color: "+vehiculo[c].getColor());
            System.out.println("Placa: "+vehiculo[c].getPlaca());
            System.out.println("Marca: "+vehiculo[c].getAño_Fab()+"\n");
        }
    }
}