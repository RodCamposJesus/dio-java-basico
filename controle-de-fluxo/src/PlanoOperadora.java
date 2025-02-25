public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        //switch case sem abilitar o break:

        switch(plano){
            case "T":{
                System.out.println("5Gb YouTube");
            }
            case "M":{
                System.out.println("Whats e instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
        /*if(plano == "B"){
            System.out.println("100 minutos de ligação");
        }else if (plano == "M" ) {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e instagram grátis");

        }else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e instagram grátis");
            System.out.println("5Gb YouTube");
        }*/
    }
}
