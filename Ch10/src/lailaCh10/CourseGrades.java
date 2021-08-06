package lailaCh10;
/*
The class should have a GradedActivity array named grades as a field.
The array should have four elements,
one for each of the assignments previously described.
*/
public class CourseGrades {
	

	/*
	 * his method should accept a GradedActivity object as its argument. 
	 * This object should already hold the student’s score for the lab activity.
	 *  Element 0 of the grades field should reference this object.
	 *  
	 *  
	 */
	

	   //Declare/Initialize Fields
	   private final int NUM_GRADES=4;
	   private GradedActivity[] grades=new GradedActivity[NUM_GRADES];
	   

	   /**
	      This constructor creates an object titled GradedActivity.
	   */
	   
	   public CourseGrades()
	   {
	      GradedActivity[] grades=new GradedActivity[NUM_GRADES];
	      System.out.print("hi");
	             
	   }
	   
	   /**
	      The setLab method loads lab grade into array of GradedActivities
	      @param aLab Lab Grade
	   */
	   
	   public void setLab(GradedActivity aLab)
	   {
	      // grades[0]=new GradedActivity();
	      grades[0]=aLab;
	   }
	   /**
	      The setPassFailExam method sets pass fail exam object into array of Graded Activities
	      @param PassFailExam Exam Object
	   */
	   
	   public void setPassFailExam(GradedActivity PassFailExam)
	   {
	      grades[1]=PassFailExam;
	   }
	   
	   /**
	      The setEssay method sets essay object into array of graded activities      
	      @param aEssay Essay Object
	   */
	   
	   public void setEssay(GradedActivity Essay)
	   {
	      grades[2]=Essay;
	   }
	   
	   /**
	      The setFinalExam method sets Final Exam object into array of graded activities
	      @param aFinalExam Final Exam object
	   */
	   
	   public void setFinalExam(FinalExam aFinalExam)
	   {
	      grades[3]=aFinalExam;
	   }
	   
	   /**
	      The toString method combines everything into a single string
	      @return str The string containing all information
	   */
	   
	   public String toString() 
	   {
	      String str="Lab Grade: "+grades[0].getScore()+ "\nExam: "+grades[1].getGrade()
	      + "\nEssay Grade: "+grades[2].getScore()+"\nFinal Exam Grade: "+grades[3].getScore();
	      return str;
	   }
	   
	   /**
	      The getAverage() method returns average of four grades
	      @return average Average of grades stored in array
	   */
	   
	   public double getAverage()
	   {
	      double average =(grades[0].getScore()+grades[1].getScore()+grades[2].getScore()+grades[3].getScore())/(double)4;
	      
	      return average;
	   }      
	   
	   /**
	      The getHighest() method returns highest GradedActivity
	      @return grades[highIndex] Highest Graded Activity
	   */
	   
	   public GradedActivity getHighest()
	   {
	      int highIndex=0;
	      
	      for (int index=1;index<NUM_GRADES;index++)
	      {
	         if(grades[index].getScore()>grades[highIndex].getScore())
	         {  
	            highIndex=index;
	         }
	      }
	      return grades[highIndex];  
	   }
	            
	   /**
	      The getLowest() method returns object with lowest score
	      @return grades[lowIndex] Object with lowest score
	   */
	   
	   public GradedActivity getLowest()
	   {
	      int lowIndex=0;
	      
	      for (int index=1;index<NUM_GRADES;index++)
	      {
	         if(grades[index].getScore()<grades[lowIndex].getScore())
	         {  
	            lowIndex=index;
	         }
	      }
	      return grades[lowIndex];  
	   }
	   
}



