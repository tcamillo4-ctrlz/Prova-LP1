public class Sofa{

    String cor;
    String tamanho;
    boolean reclinado;

    public Sofa(String cor, String tamanho, boolean reclinado){
        this.cor = cor;
        this.tamanho = tamanho;
        this.reclinado = reclinado;
    }

    public void setCor(String novacor) {
        cor = novacor;
    }
    public String getCor() {
        return cor;  
    }

    public void setTamanho(String novotamanho) {
        tamanho = novotamanho;
    }
    public String getTamanho() {
        return tamanho;  
    }

    public void setReclinado(boolean novoreclinado) {
        reclinado = novoreclinado;
    }
    public String getRelinado() {
        return reclinado;  
    }

    public void reclinarencosto(){
        System.out.println("Sofa reclinado!");
        this.reclinado = true;
    }

    public void voltarencosto(){
        System.out.println("Sofa voltou ao normal!");
        this.reclinado = false;
    }

    public static void main(String[] args) {
        
        Sofa sofa = new Sofa();

        sofa.reclinarencosto();

        sofa.voltarencosto();

    }




}
