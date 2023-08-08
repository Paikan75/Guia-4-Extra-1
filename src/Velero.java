class Velero extends Barco {
    private int numMastiles;

    public Velero(String matricula, double eslora, int añoFabricacion, int numMastiles) {
        super(matricula, eslora, añoFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numMastiles;
    }

    @Override
    public String getTipoBarco() {
        return "Velero";
    }
}