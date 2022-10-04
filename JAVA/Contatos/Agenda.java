
/**
 * @author robson Paiva
 */
public class Agenda {
    public String nome;
    public Contato[] contato;
    
    
    public String getNome() {
        return nome;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
    
    
    public String getMostrarContatos(){
        String info = "NOME DA AGENDA "+ this.nome + "\n ";
        for(int i = 0; i <contato.length; i++ ){
            info += contato[i].toString();
        }
        return info;
    }
}
