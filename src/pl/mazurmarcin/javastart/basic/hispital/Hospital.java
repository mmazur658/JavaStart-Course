package pl.mazurmarcin.javastart.basic.hispital;

public class Hospital {

    private final int maxPatientsNumber = 10;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int regPatiens = 0;

    public void addPatient(Patient patient) {
        if (regPatiens < 10) {
            patients[regPatiens] = patient;
            regPatiens++;
        } else {
            System.out.println("Nie można dodać więcej pacjentów do kolejki.");
        }
    }

    public void showAllPatients() {

        if (regPatiens == 0)
            System.out.println("Lista pusta");
        else {
            for (int i=0; i<regPatiens;i++)
                System.out.println(patients[i].toString());
        }


    }
}
