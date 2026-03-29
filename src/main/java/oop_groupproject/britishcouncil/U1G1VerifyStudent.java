package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G1VerifyStudent implements Serializable {
    private String studentId;

    public U1G1VerifyStudent(String id) {
        this.studentId = id;
    }

    public boolean validate() {
        return studentId.matches("\\d{7}"); } // VL [cite: 11]
}