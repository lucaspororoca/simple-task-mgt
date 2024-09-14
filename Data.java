public class Data {
    public int dia = 0;
    public int mes = 0;
    public int ano = 2024;

    public void ExibirData(int dia1, int mes1, int ano1){
        this.dia = dia1;
        this.mes = mes1;
        this.ano = ano1;

        if(dia > 31){ dia = 31;}

        if(dia < 0){dia = 1;}

        System.out.println(dia);

        switch(mes){
            case 1:
                System.out.println(dia + "/01/" + ano);
                break;
            case 2:
                System.out.println(dia + "/02/" + ano);
                break;
        }
    }
}
