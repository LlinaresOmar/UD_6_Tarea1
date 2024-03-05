package es.iesmz;

public class EmpleadoBR {

    private TipoEmpleado tipo;
    private float salario;
    private float ventaMes;
    private int horasExtra;

    public EmpleadoBR(TipoEmpleado tipo, float ventaMes, int horasExtra) {
        this.tipo = tipo;
        this.ventaMes = ventaMes;
        this.horasExtra = horasExtra;
    }

    public float calcularSalarioBruto(){
        if (this == null || ventaMes < 0 || horasExtra < 0) {
            if (tipo == TipoEmpleado.vendedor) {
                salario = 1000;
            }
            if (tipo == TipoEmpleado.encarregat) {
                salario = 1500;
            }
            if (ventaMes >= 1000) {
                salario += 100;
            } else if (ventaMes >= 1500) {
                salario += 100;
            }
            salario += horasExtra * 20;
            return salario;
        }
        return -1;
    }

    public float calcularSalarioNeto() {
        int retencion = 0;
        if (salario > 0) {
            if (calcularSalarioBruto()>1000){
                retencion = 16;
            } else if (calcularSalarioNeto()>1500){
                retencion = 18;
            }
            return calcularSalarioBruto()*retencion/100;
        }
        return -1;
    }

}
