package set.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenta(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obeterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);//Organizando os eventos em ordem
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){//isAfter é como um depois.
                proximaData= entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: "+proximoEvento+" acontecera na data "+ proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY,15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025,7,9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2005,1,10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024,12,12), "Evento 4", "Atração 4");

        agendaEventos.exibirAgenta();
        agendaEventos.obeterProximoEvento();

    }
}
