public class  HelloWorldApp2{
    public static void main(String args[]){

        //Se toma vairbale de entorno de github 
        String user = System.getenv("USERNAME");       
        String lenguaje = System.getenv("LANGUAGE");
        System.out.println("Hola "+user+" desde github");
        System.out.println("Mi lenguaje favorito es: "+lenguaje);
    }
    }
}