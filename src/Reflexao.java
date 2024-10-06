public class Reflexao {
    private String atributo1;


    public void SetAtributo1(String atributo1){
        this.atributo1 = atributo1;
    }

    public String getAtributo1(){
        return atributo1;
    }

    protected String metodo1(String value){
        return value;
    } protected boolean metodo2(boolean value){
        return value;
    }
}
