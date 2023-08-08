class BarcoAMotor extends Barco {
    private int potenciaCV;

    public BarcoAMotor(String matricula, double eslora, int añoFabricacion, int potenciaCV) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }

    @Override
    public String getTipoBarco() {
        return "Barco a Motor";
    }
}