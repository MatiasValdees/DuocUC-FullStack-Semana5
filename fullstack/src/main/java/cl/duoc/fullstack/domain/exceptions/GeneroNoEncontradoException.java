package cl.duoc.fullstack.domain.exceptions;

public class GeneroNoEncontradoException extends RuntimeException {
    public GeneroNoEncontradoException (String field,String value){
        super(String.format("No se ha encontrado género con %s : %s",field,value));
    }

}
