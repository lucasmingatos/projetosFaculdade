package aula04;

import java.time.Year;

public class Data {

    //Atributos
    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = -1;
        }
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = -1;
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setAno(int ano) {
        if (ano >= 1000 && ano <= Year.now().getValue()) {
            this.ano = ano;
        } else {
            this.ano = -1;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public String getDataFormatada() {
        if (this.dia != -1 && this.mes != -1 && this.ano != -1) {
            return String.format("%02d/%02d/%d",
                    this.dia, this.mes, this.ano
            );
        } else {
            return "data inválida";
        }
    }

    public String getDataPorExtenso() {
        String meses[] = {"Janeiro","Fevereiro","Março","Abril",
            "Maio","Junho","Julho","Agosto","Setembro","Outubro",
            "Novembro","Dezembro"};
        
        return String.format("%02d de %s de %d",
          this.dia,
          meses[this.mes-1],
          this.ano
        );
    }

}
