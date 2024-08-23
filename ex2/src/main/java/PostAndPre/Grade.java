package PostAndPre;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.stereotype.Component;


public class Grade {
	private float grade1;
	public float getGrade1() {
		return grade1;
	}
	
	public Grade() {
		System.out.println(" initial from grade");
	}

	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}

	private float grade2;

//	public Grade(float a,float b) {
//		this.grade1 = a;
//		this.grade2=b;
//	}


	public float getmeMygrade() {
		return ((grade1+grade2)/2);
	}

}
