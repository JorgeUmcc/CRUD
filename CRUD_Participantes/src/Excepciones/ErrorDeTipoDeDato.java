package Excepciones;


 public class ErrorDeTipoDeDato extends NullPointerException {
     public ErrorDeTipoDeDato(){
         super("Ha ocurrido un error al entrar algun dato. Al parecer no era un numero.");
     }
     
     public ErrorDeTipoDeDato(String msg){
         super(msg);
     }
    
}
