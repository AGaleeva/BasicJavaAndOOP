package homeWork16;

import practicum.MyDate;

import static practicum.MethodDateToString.dateToStringWithObject;

public class CreateNewPatient {
    public static void main(String[] args) {

        Patient patient1 = new Patient();
        MyDate birthdate1 = new MyDate();
        MyDate dateOfAdmission1 = new MyDate();

        birthdate1.day = 21;
        birthdate1.month = 11;
        birthdate1.year = 1995;

        dateOfAdmission1.day = 8;
        dateOfAdmission1.month = 8;
        dateOfAdmission1.year = 2023;

        patient1.firstName = "Bruno";
        patient1.lastName = "Mäenpää";
        patient1.birthday = birthdate1;
        patient1.departmentOfHospital = "Internal Medicine";
        patient1.dateOfAdmission = dateOfAdmission1;
        patient1.diagnosis = "is still unknown";

        System.out.println(patient1.firstName + " " + patient1.lastName + ", " + dateToStringWithObject(patient1.birthday) + ". \n"
                + "Department of " + patient1.departmentOfHospital + ", was admitted at the Hospital at " + dateToStringWithObject(patient1.dateOfAdmission) + ", the diagnosis " + patient1.diagnosis + ".");

    }
}
