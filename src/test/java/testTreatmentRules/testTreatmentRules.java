package testTreatmentRules;

import java.sql.Date;
import java.time.LocalDate;

import org.drools.ruleunits.api.RuleUnitInstance;
import org.drools.ruleunits.api.RuleUnitProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import entities.*;

public class testTreatmentRules {
    
    
    private static MedicalHistory_Unit mHistUnit;
    private static RuleUnitInstance<MedicalHistory_Unit> droolsInstance;

    @Before
    public void setUpDrools(){
        mHistUnit = new MedicalHistory_Unit();
        droolsInstance = RuleUnitProvider.get().createRuleUnitInstance(mHistUnit);
    }
    @After
    public void tearDownDrools(){
        droolsInstance.close();
    }

    @Test
    public void testTreatmentRulesTrue(){
        Assert.assertEquals(true,true);
    }


    @Test
    public void testPhenotypeASeverity1(){
        
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('A');
        m.setSeverityLevel(1);
        
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"SABA / SAMA or LAMA / LABA");
    }
    @Test
    public void testPhenotypeASeverity2(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('A');
        m.setSeverityLevel(2);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA / LABA or LAMA + LABA");
    }
    @Test
    public void testPhenotypeASeverity3(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('A');
        m.setSeverityLevel(3);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA");
    }
    @Test
    public void testPhenotypeASeverity4(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('A');
        m.setSeverityLevel(4);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA or LAMA + LABA + Teofiline");
    }
    @Test
    public void testPhenotypeBSeverity1(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('B');
        m.setSeverityLevel(1);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LABA + ICS");
    }
    @Test
    public void testPhenotypeBSeverity2(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('B');
        m.setSeverityLevel(2);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LABA + ICS");
    }
    @Test
    public void testPhenotypeBSeverity3(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('B');
        m.setSeverityLevel(3);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA + ICS");
    }
    @Test
    public void testPhenotypeBSeverity4(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('B');
        m.setSeverityLevel(4);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA + ICS, Consider adding Teofiline/PDE4 with expectoration");
    }
    @Test
    public void testPhenotypeCSeverity1(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('C');
        m.setSeverityLevel(1);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA / LABA");
    }
    @Test
    public void testPhenotypeCSeverity2(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('C');
        m.setSeverityLevel(2);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"(LAMA / LABA) + ICS or LAMA + LABA or LAMA/LABA");
    }
    @Test
    public void testPhenotypeCSeverity3(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('C');
        m.setSeverityLevel(3);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA + ICS");
    }
    @Test
    public void testPhenotypeCSeverity4(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('C');
        m.setSeverityLevel(4);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA + ICS, Consider adding Teofiline");
    }
    @Test
    public void testPhenotypeDSeverity1(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('D');
        m.setSeverityLevel(1);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA / LABA");
    }
    @Test
    public void testPhenotypeDSeverity2(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('D');
        m.setSeverityLevel(2);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"(LAMA / LABA) + (ICS / PDE4) or LAMA + LABA or  LAMA / LABA");
    }
    @Test
    public void testPhenotypeDSeverity3(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('D');
        m.setSeverityLevel(3);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA + (ICS / PDE4) or (LAMA / LABA) + ICS + PDE4, and consider adding Carbocisteine");
    }
    @Test
    public void testPhenotypeDSeverity4(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('D');
        m.setSeverityLevel(4);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"LAMA + LABA + (ICS / PDE4) or LAMA + LABA + ICS + PDE4, and consider adding Carbocisteine/Antibiotics");
    }
    @Test
    public void testDate(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('A');
        m.setSeverityLevel(1);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getBeginDate().toString(),Date.valueOf(LocalDate.now()).toString());
    }
    @Test
    public void testDuration(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype('A');
        m.setSeverityLevel(1);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getDuration(),21);
    }
    @Test
    public void testUnknown(){
        MedicalHistory m = new MedicalHistory();
        m.setPhenotype(null);
        m.setSeverityLevel(0);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getDuration(),0);
    }
    @Test
    public void testAATD(){
        MedicalHistory m = new MedicalHistory();
        SignsAndSymptoms s = new SignsAndSymptoms();
        s.setAatd(true);
        m.setSignsAndSymptoms(s);
        mHistUnit.getMHist().add(m);
        droolsInstance.fire();

        Assert.assertEquals(m.getSuggestedTreatment(),"Alpha-1-Antitrypsin (AAT) therapy");
    }

}
