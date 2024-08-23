package initial;

public class Grade {
	private float grade1;
	private float grade2;

	public Grade(float a,float b) {
		this.grade1 = a;
		this.grade2=b;
	}


	public float getmeMygrade() {
		return ((grade1+grade2)/2);
	}

}
