public class Mobile{
    String brand;
    int price;
    String network;
    //	String name;
    static String name;

    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Mobile obj)
    {
//		System.out.println("in static method");
        System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
    }
}

//Um método static pertence à classe, e não a uma
// instância específica da classe (objeto

// Métodos static podem ser chamados diretamente
// usando o nome da classe (por exemplo, NomeDaClasse.metodoStatic())

//Métodos static não podem acessar diretamente variáveis de
// instância (não static) da classe

//métodos static não têm acesso a um objeto específico da classe.

//Para acessar variáveis de instância em um método static, você precisa passar um objeto da classe como parâmetro para o método