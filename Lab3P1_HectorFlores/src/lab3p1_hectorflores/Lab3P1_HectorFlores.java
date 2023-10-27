package lab3p1_hectorflores;
import java.util.Scanner;

public class Lab3P1_HectorFlores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Sucesiones y mas sucesiones");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa");
        System.out.println("Ingresar cualquier otro numero termina el programa");
        
        System.out.print("Ingrese su opcion: ");
        int opcion = sc.nextInt();
        System.out.println(" ");
        
        while (opcion >= 1 && opcion <= 3){
            switch (opcion){
                case 1:
                    System.out.println("Sucesiones y mas sucesiones");
                    System.out.println("Ingrese el valor inicial");
                    int inicio = sc.nextInt();
                    int inicio2 = inicio;
                    System.out.println("Ingrese la diferencia");
                    int dif = sc.nextInt();
                    int dif2 = dif;
                    System.out.println("Cantidad a visualizar en la sucesion");
                    int cantidad = sc.nextInt();
                    while (cantidad < 0){
                        System.out.println("Debe ser un numero positivo o 0 en el caso que no desee ver la sucesion");
                        cantidad = sc.nextInt();
                    }
                    
                    for (int a = 1; a <= cantidad; a++){
                        if (a == cantidad){
                            System.out.print(inicio);
                        } else {
                            System.out.print(inicio + ", ");
                        }
                        inicio += dif;
                        dif++;
                        
                    }
                    System.out.println(" ");
                    System.out.println("Que valor mas adelante de la sucesion desea ver?");
                    int adelante = sc.nextInt();
                    
                    while (adelante <= cantidad){
                        System.out.println("Debe ser un termino mayor a la posicion " + cantidad);
                        adelante = sc.nextInt();
                    }

                    for (int a = 1; a < adelante; a++){
                        inicio2+= dif2;
                        dif2++;
                    }
                    
                    System.out.println("El numero seria: " + inicio2);
                    System.out.println(" ");
                    break;
                    
                case 2:
                    System.out.println("Pocket Monsters");
                    System.out.println("Que tipo de ronda desea?");
                    System.out.println("1. Por rondas");
                    System.out.println("2. Hasta la muerte");
                    int modo = sc.nextInt();
                    System.out.println(" ");
                    
                    while (modo < 1 || modo > 2){
                        System.out.println("Elija un tipo de ronda valida.");
                        modo = sc.nextInt();
                        System.out.println(" ");
                    }
                    
                    System.out.println("Estadisticas de los pokemones:");
                    System.out.println("Sylveon Vida: 280 Ataque: 80 Defensa: 15%");
                    System.out.println("Gyarados Vida: 300 Ataque: 50 Defensa: 10%");
                    System.out.println("Giratina Vida: 300 Ataque: 70 Defensa: 25%");
                    System.out.println("Dragonite Vida: 250 Ataque: 75 Defensa: 20%");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese una pelea determinada");
                    System.out.println("1. Sylveon vrs Dragonite");
                    System.out.println("2. Gyarados vrs Giratina");
                    System.out.println("3. Dragonite vrs Giratina");
                    System.out.println("4. Giratina vrs Sylveon");
                    System.out.println(" ");
                    
                    int pelea = sc.nextInt();
                    while (pelea < 1 || pelea > 4){
                        System.out.println("Ingresar una pelea valida");
                        pelea = sc.nextInt();
                    }
                    
                    double v1 = 0;
                    double v2 = 0;
                    double a1 = 0;
                    double a2 = 0;
                    double d1 = 0;
                    double d2 = 0;
                    String p1 = "";
                    String p2 = "";
                    
                    switch (pelea){
                        case 1:
                            p1 = "Sylveon";
                            v1 = 280;
                            a1 = 80;
                            d1 = 0.15;
                            p2 = "Dragonite";
                            v2 = 250;
                            a2 = 75;
                            d2 = 0.2;
                            break;
                            
                        case 2:
                            p1 = "Gyarados";
                            v1 = 300;
                            a1 = 50;
                            d1 = 0.1;
                            p2 = "Giratina";
                            v2 = 300;
                            a2 = 70;
                            d2 = 0.25;
                            break;
                            
                        case 3:
                            p1 = "Dragonite";
                            v1 = 250;
                            a1 = 75;
                            d1 = 0.2;
                            p2 = "Giratina";
                            v2 = 300;
                            a2 = 70;
                            d2 = 0.25;
                            break;
                            
                        case 4:
                            p1 = "Giratina";
                            v1 = 300;
                            a1 = 70;
                            d1 = 0.25;
                            p2 = "Sylveon";
                            v2 = 280;
                            a2 = 80;
                            d2 = 0.15;
                            break;
                    }
                    
                    switch (modo){
                        case 1:
                            System.out.println("Cuantas rondas desea hacer?");
                            int rondas = sc.nextInt();
                            
                            while (rondas < 1){
                                System.out.println("Ingrese un numero valido de rondas (1 o mas)");
                                rondas = sc.nextInt();
                            }
                            int a = 1;
                            while (a <= rondas){
                                if (v1 <= 0){
                                    v1 = 0;
                                    System.out.println(p1 + " no puede continuar. Fin de la batalla.");
                                    break;
                                } else if (v2 <= 0){
                                    v2 = 0;
                                    System.out.println(p2 + " no puede continuar. Fin de la batalla.");
                                    break;
                                }
                                System.out.println("---------Ronda " + a +"---------");
                                a++;
                                
                                System.out.println("Vida de " + p1 + ": " + v1);
                                System.out.println("Vida de " + p2 + ": " + v2);
                                System.out.println(" ");
                                
                                v2-= a1 * (1 - d2);
                                v1-= a2 * (1 - d1);
                                
                                System.out.println(p1 + " ha atacado!");
                                System.out.println(p2 + " ha atacado!");
                                System.out.println(" ");
                                
                                if (v1 < 0){
                                    v1 = 0;
                                } 
                                if (v2 < 0){
                                    v2 = 0;
                                }
                                
                                System.out.println("Vida de " + p1 + ": " + v1);
                                System.out.println("Vida de " + p2 + ": " + v2);
                            }
                            if (v1 > v2){
                                System.out.println(p1 + " gano con " + v1 + " puntos de vida.");
                            } else if (v2 > v1){
                                System.out.println(p2 + " gano con " + v2 + " puntos de vida.");
                            } else {
                                System.out.println("Empate! han acabado con " + v1 + " puntos de vida.");
                            }
                            System.out.println(" ");
                            
                            
                            break;
                            
                        case 2:
                            a = 1;
                            while (true){
                                if (v1 <= 0){
                                    v1 = 0;
                                    System.out.println(p1 + " no puede continuar. Fin de la batalla.");
                                    break;
                                } else if (v2 <= 0){
                                    v2 = 0;
                                    System.out.println(p2 + " no puede continuar. Fin de la batalla.");
                                    break;
                                }
                                System.out.println("---------Ronda " + a +"---------");
                                a++;
                                
                                System.out.println("Vida de " + p1 + ": " + v1);
                                System.out.println("Vida de " + p2 + ": " + v2);
                                System.out.println(" ");
                                
                                v2-= a1 * (1 - d2);
                                v1-= a2 * (1 - d1);
                                
                                System.out.println(p1 + " ha atacado!");
                                System.out.println(p2 + " ha atacado!");
                                System.out.println(" ");
                                
                                if (v1 < 0){
                                    v1 = 0;
                                } 
                                if (v2 < 0){
                                    v2 = 0;
                                }
                                
                                System.out.println("Vida de " + p1 + ": " + v1);
                                System.out.println("Vida de " + p2 + ": " + v2);
                            }
                            
                            if (v1 > v2){
                                System.out.println(p1 + " gano con " + v1 + " puntos de vida.");
                            } else if (v2 > v1){
                                System.out.println(p2 + " gano con " + v2 + " puntos de vida.");
                            } else {
                                System.out.println("Empate! han acabado con " + v1 + " puntos de vida.");
                            }
                            System.out.println(" ");
                    }
                    break;
                
                case 3:
                    System.out.println("Asterisco en casa");
                    System.out.println("Ingrese dimencion impar y mayor a 7: ");
                    int dim = sc.nextInt();
                    
                    while (dim % 2 == 0 || dim < 7){
                        System.out.println("Debe ser impar y mayor a 7. Vuelva a asignar");
                        dim = sc.nextInt();
                    }
                    int b = 1;
                    int c = 2;
                    int d = dim - b;
                    for (int a = 1; a <= dim; a++){
                        for (b = 1; b <= dim; b++){
                            if(a == 1 || a == dim || b == 1 || b == dim){
                                System.out.print("* ");
                            } else if (b == (dim-2)/2+2){
                                System.out.print("| ");
                            } else if (c != (dim-2)/2+2 && a==b){
                                System.out.print("> ");
                            } else if (c != (dim-2)/2+2 && a==d){
                                System.out.print("> ");
                            } else{
                                System.out.print("  ");
                            }
                            d = dim - b;
                        }
                        System.out.println(" ");
                    }
                    break;
                    
                    
            }
            System.out.println("1. Sucesiones y mas sucesiones");
            System.out.println("2. Pocket Monsters");
            System.out.println("3. Asterisco en casa");
            System.out.println("Ingresar cualquier otro numero termina el programa");

            System.out.print("Ingrese su opcion: ");
            
            opcion = sc.nextInt();
            System.out.println(" ");
        }
    }
    
}
