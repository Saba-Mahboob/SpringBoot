package xml;

public class Grade {
	private float grade1;
	private float grade2;

	


	public float getGrade1() {
		return grade1;
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




	public float getmeMygrade() {
		return ((grade1+grade2)/2);
	}

}
