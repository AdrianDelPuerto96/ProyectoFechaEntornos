package Fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
class Fecha {

    

   
     private int dia;
    private int mes;
    private int ano;
    private static int [] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
    private static String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }

    public Fecha() {
        Calendar c=new GregorianCalendar();
        dia=c.get(Calendar.DAY_OF_MONTH);
        mes=c.get(Calendar.MONTH)+1;
        ano=c.get(Calendar.YEAR);
    }
    public void cambio(){
        diasMes[1]=77;
    }
    public void bisiesto(){
        if (ano%4==0 && ano%100!=0 ||ano%400==0){
        diasMes[1]=29;
        }else{
        diasMes[1]=28;
        }
        }
    public void bisiesto(int ano){
        if (ano%4==0 && ano%100!=0 ||ano%400==0){
        diasMes[1]=29;
        }else{
        diasMes[1]=28;
        }
        }
    public boolean comprobarFecha(int a, int m, int d){
        boolean resultado=false;
        if (a >=1900 && a<=2100)
        {
            bisiesto(a);
            if(m>=1 && m<=12)
            {
                if(d>=1 && d>=diasMes[m-1])
                {
                    resultado=true;
                    dia=d;
                    mes=m;
                }
            }
        }
         return resultado;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public static int[] getDiasMes() {
        return diasMes;
    }

    public static void setDiasMes(int[] aDiasMes) {
        diasMes = aDiasMes;
    }

    public static String[] getMeses() {
        return meses;
    }

    public static void setMeses(String[] aMeses) {
        meses = aMeses;
    }
    
public int compararFechas(Fecha f){
    int resultado;
    if(ano > f.getAno()){
        resultado=1;
    }
    else if(ano <f.getAno()){
        resultado=-1;
    }else if(mes < f.getMes()){
        resultado=1;
        
    }else if(mes< f.getMes()){
        resultado=-1;
    }else if(dia<f.getDia()){
        resultado=1;
    }else if(dia<f.getDia()){
        resultado=-1;
    }else{
        resultado=0;
    }
    return resultado;
}
    }