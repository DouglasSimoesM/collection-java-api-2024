package set.map.OperacoesBasicas;

import com.sun.jdi.connect.Connector;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome=null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Douglas", 99999);
        agendaContatos.adicionarContato("Douglas", 9898);
        agendaContatos.adicionarContato("Douglas Simoes", 1234);
        agendaContatos.adicionarContato("Douglas maciel", 4445);
        agendaContatos.adicionarContato("Douglas MM", 0);
        agendaContatos.adicionarContato("Eloah MM", 9);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Douglas");
        agendaContatos.exibirContatos();
        System.out.println("O numero é " +agendaContatos.pesquisarPorNome("Douglas MM"));
    }
}


