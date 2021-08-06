package lailaCh10;

public class Essay {
	private double grammar;
	private double spelling;
	private double correctLength;
	private double content;

	public void setScore(double gr, double sp, double len, double cnt) {
	    grammar = gr;
	    spelling = sp;
	    correctLength = len;
	    content = cnt;
	}

	private void setGrammar(double g) {
	    grammar = g;
	}

	private void setSpelling(double s) {
	    spelling = s;
	}

	private void setCorrectLength(double c) {
	    correctLength = c;
	}

	private void setContent(double c) {
	    content = c;
	}

	public double getGrammar() {
	    return grammar;
	}

	public double getSpelling() {
	    return spelling;
	}

	public double getCorrectLength() {
	    return correctLength;
	}

	public double getScore() {
	    return getScore();
	}

	} // end of class

