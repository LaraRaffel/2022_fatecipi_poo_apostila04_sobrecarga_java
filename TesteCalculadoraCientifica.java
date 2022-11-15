public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica conta = new CalculadoraCientifica();
        //foi criada duas variáveis do tipo byte a fim de diferenciar byte de int
        byte a = 3;
        byte b = -20;
        System.out.println(conta.potencia("2", "3"));
        System.out.println(conta.potencia(6, 7));
        System.out.println(conta.potencia(a,b));
        System.out.println(conta.raiz(4)); 
        System.out.println(conta.raiz(10.4)); 
        System.out.println(conta.raiz("9")); 
    }
}