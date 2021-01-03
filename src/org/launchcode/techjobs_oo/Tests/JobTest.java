package org.launchcode.techjobs_oo.Tests;


//import org.testng.annotations.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;


public class JobTest {

    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    Job testJob5;
    Job testJob6;


   @Before
   public void jobObject(){
       testJob1 = new Job();
       testJob2 = new Job();
       testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                  new PositionType("Quality Control"), new CoreCompetency("Persistence"));
       testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                  new PositionType("Quality Control"), new CoreCompetency("Persistence"));
       testJob5 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("QA"), new CoreCompetency("Persistence"));
       testJob6 = new Job("Product tester", new Employer(""),new Location ("Desert"), new PositionType("QA"), new CoreCompetency("Persistence"));
   }

    @Test
    public void testSettingJobId(){
       assertEquals(1, testJob2.getId() - testJob1.getId(), .001);
        System.out.println(testJob1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(true,testJob3 instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
       assertEquals(false, testJob3.equals(testJob4));
    }

    @Test
    public void testToStringForNewLineAtBeginning(){
       assertEquals(true, testJob3.toString().startsWith("\n"));
    }

    @Test
    public void testToStringForDataNotAvailable(){
       assertEquals(true, testJob5.toString().contains("Data not available"));
    }

    @Test
    public void testToStringForMoreDataNotAvailable(){
       assertEquals(true, testJob6.toString().contains("Data not available"));
    }
}
