package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adiconarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadePorCodigoConvite(int codigoConvite){
        Convidado convidadeoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodConvite()== codigoConvite){
                convidadeoParaRemover = c;
                break;
            }else {
                System.out.println("Codigo de convite invalido!");
            }
        }
        convidadoSet.remove(convidadeoParaRemover);
    }
    //PARA RETORNAR QUANTIDADE EM UMA LISTA, COMANDO SIZE();
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" dentro do set de convidados");

        conjuntoConvidados.adiconarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adiconarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adiconarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adiconarConvidado("Convidado 4", 1236);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" dentro do set de convidados");

        conjuntoConvidados.removerConvidadePorCodigoConvite(1235);
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" dentro do set de convidados");
        conjuntoConvidados.exibirConvidados();

    }
}
