package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adiconarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtulizado = null;
        for (Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtulizado = c;
                break;
            }
        }
        return contatoAtulizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adiconarContato("Douglas", 123456);
        agendaContatos.adiconarContato("Douglas", 0);
        agendaContatos.adiconarContato("Douglas Simoes", 11111);
        agendaContatos.adiconarContato("Douglas Maciel", 23232);
        agendaContatos.adiconarContato("Amanda MM", 2323443);
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Douglas"));

    }
}
