class YateDeLujo extends Barco {
    private int potenciaCV;
    private int numCamarotes;

    public YateDeLujo(String matricula, double eslora, int añoFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numCamarotes;
    }

    @Override
    public String getTipoBarco() {
        return "Yate de Lujo";
    }
}
