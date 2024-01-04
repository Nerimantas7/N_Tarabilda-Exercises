package lt.techin;

//      Uzduotis Nr. 6
public class Automobilis {
    private String marke, modelis;
    private int metai;

    public void setValues(String marke, String modelis, int metai){
        this.marke = marke;
        this.modelis = modelis;
        this.metai = metai;
    }

    public String getValues(){
        String infoAuto = "Marke: " + marke + ", Modelis: " + modelis + ", Metai: " + metai;
        return infoAuto;
    }

    public Automobilis(String marke, String modelis, int metai) {
        System.out.println("Objektas sukurtas");
        setValues(marke, modelis, metai);
        System.out.println(getValues());
    }
}
