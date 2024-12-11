package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atribusto
    private List<Pessoa> listPessoa;

    public OrdenacaoPessoa() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade=new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 28, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}


