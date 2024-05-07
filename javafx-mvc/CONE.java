
public class CONE
{
    double raio;
    double altura;
    
    public CONE() {
        this.raio = 0;
        this.altura = 0;
    }
    
    public CONE(double altura, double raio)
    {
        this.altura = altura;  
        this.raio = raio;
    }

    public double calcular()
    {
        if (this.altura <= 0 || this.raio <= 0)
            return 0;
        return (this.raio * this.raio * this.altura * 3.14)/3 ;
    }
    
    public String interpretar()
    {
        String resultado = "";
        double imc = this.calcular();
        if (imc == 0)
            resultado += "Dados incompletos ou inválidos";
        else
            resultado += "Calculo feito com sucesso";
        return resultado;
    }
}
