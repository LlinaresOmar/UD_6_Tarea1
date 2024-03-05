package es.iesmz;

public class EmpleadoBR {

    private static TipoEmpleado tipo;
    private static float salario;
    private static float ventaMes;
    private static int horasExtra;

    public EmpleadoBR(TipoEmpleado tipo, float ventaMes, int horasExtra) {
        this.tipo = tipo;
        this.ventaMes = ventaMes;
        this.horasExtra = horasExtra;

    }

    public static float calcularSalarioBruto(TipoEmpleado tipo, float ventaMes, int horasExtra) {
        salario = 0;
        if (tipo == TipoEmpleado.encarregat) {
            salario = 1500;
        }
        if (tipo == TipoEmpleado.venedor) {
            salario = 1000;
        }
        if (ventaMes >= 1000) {
            salario += 100;
        }
        if (ventaMes >= 1500) {
            salario += 100;
        }
        if (salario > 0) {
            return salario += horasExtra * 20;
        } else {
            return -1;
        }
    }

    public static float calcularSalarioNeto(float salarioBruto) {
        if (salarioBruto < 1000 && salarioBruto > 0) return salarioBruto;
        if (salarioBruto >= 1000 && salarioBruto < 1500) return salarioBruto*0.84f;
        if (salarioBruto >=1500) return salarioBruto*0.82f;
        else return -1;
    }
}
