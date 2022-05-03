public class Switch{

  public static void main(String args[]){

    var estacion = "VERANO";

    switch(estacion){
    case "VERANO":
        System.out.println("Es verano");
        break;
    case "INVIERNO":
        System.out.println("Es invierno");
        break;
    case "PRIMAVERA":
        System.out.println("Es primavera");
        break;
   case "OTOÑO":
        System.out.println("Es Otoño");
        break;
    default:
        System.out.println("esa estacion no existe");
  }
 }
}