public class q9 {
    public static void main(String[] args) {
        double salario = 340;
        double aumento, novo_salario;
        String ajuste;

        if(salario <= 280) {
            aumento = salario * 0.20;
            novo_salario = salario + aumento;
            ajuste = "20%";
        } else if (salario > 280 && salario <= 700) {
            aumento = salario * 0.15;
            novo_salario = salario + aumento;
            ajuste = "15%";
        } else if (salario > 700 && salario <= 1500) {
            aumento = salario * 0.10;
            novo_salario = salario + aumento;
            ajuste = "10%";
        }else {
            aumento = salario * 0.05;
            novo_salario = salario + aumento;
            ajuste = "5%";
        }

        System.out.println("Salário antes do ajuste: " + salario);
        System.out.println("Percentual de ajuste: " + ajuste);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Valor do salário após o aumento: " + novo_salario);
    }
}
