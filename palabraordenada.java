public class palabraordenada {
    
//by aulaenlanube.com
public static void main(String[] args)
{        
    //palabra analizada
    String palabra="abcdef";

    if(orden(palabra)) System.out.println("La palabra está ordenada alfabéticamente");
    else System.out.println("La palabra NO está ordenada alfabéticamente");
}

//método que comprueba si una palabra está ordenada alfabéticamente
//ejemplo: abcdef -> true    
public static boolean orden(String cad)
{
    cad=cad.toLowerCase();
    if(cad.length()>1) 
    {
        if(cad.charAt(0)<=cad.charAt(1)) 
        return orden(cad.substring(1, cad.length()));
        else return false; 
    }
    else return true;       
}    
}
