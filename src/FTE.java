
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */

// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {
    
    /**
     *
     */
    private final double yearlySalary;
    
    /**
     *
     * @param eN
     * @param fN
     * @param lN
     * @param g
     * @param wL
     * @param dR
     * @param yS
     * @param status
     */
    public FTE(int eN, String fN, String lN, String g, String wL, double dR, String status, double yS) {
        super(eN, fN, lN, g, wL, dR, status);
        yearlySalary = yS;
        
    }
    
    
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    
    public double calcAnnualNetIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
    
}
