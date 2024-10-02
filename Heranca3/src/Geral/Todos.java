package Geral;
import SubClasses.*;//Chamando todas as classes da determinada pasta.
public class Todos {
 
	public static void main(String[] args) {//Finalmente, hora de chamar todas as classes a mostrar os seus respectivos Atributos
        Tipo carro = new Carro("Gol", 2005, 7, "Preto", true);
        Tipo moto = new Moto("Bis", 2014, 125, 60);
        Tipo cam = new Cam("Carga", 2018, 6, 18500);
        Tipo bike = new Bike("Profissional", 2023, "Caloi", "Branca", "Carbono", 27, true);
        Tipo skate = new Skateboard("Skate do Tony Hawk", 2024, "Fischer", "Preto", "Lisas");

        //Mostrando os métodos
        System.out.println(carro.geraInsert());
        System.out.println(moto.geraInsert());
        System.out.println(cam.geraInsert());
        System.out.println(bike.geraInsert());
        System.out.println(skate.geraInsert());
    }
}

